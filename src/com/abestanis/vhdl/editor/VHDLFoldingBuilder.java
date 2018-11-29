package com.abestanis.vhdl.editor;

import com.abestanis.vhdl.psi.VHDLContextClause;
import com.abestanis.vhdl.psi.VHDLContextItem;
import com.intellij.lang.ASTNode;
import com.intellij.lang.folding.FoldingBuilder;
import com.intellij.lang.folding.FoldingDescriptor;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.tree.IElementType;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.abestanis.vhdl.psi.VHDLTypes.*;

public class VHDLFoldingBuilder implements FoldingBuilder {
    private final static List<IElementType> FOLD_TYPES = Arrays.asList(
            CONTEXT_CLAUSE, ENTITY_DECLARATION, PORT_CLAUSE, GENERIC_CLAUSE, PORT_MAP_ASPECT,
            GENERIC_MAP_ASPECT, ARCHITECTURE_BODY, PROCESS_STATEMENT, IF_STATEMENT, CASE_STATEMENT,
            CASE_STATEMENT_ALTERNATIVE, SUBPROGRAM_BODY, LOOP_STATEMENT, CONFIGURATION_DECLARATION,
            PACKAGE_DECLARATION, PACKAGE_BODY, AGGREGATE
    );
    private static final Matcher NOT_NEWLINE_MATCHER = Pattern.compile(".").matcher("");
    
    @NotNull
    @Override
    public FoldingDescriptor[] buildFoldRegions(
            @NotNull ASTNode astNode, @NotNull Document document) {
        List<FoldingDescriptor> foldingRegions = new ArrayList<>();
        addFoldingRegionsFor(astNode, foldingRegions);
        return foldingRegions.toArray(new FoldingDescriptor[0]);
    }

    @Nullable
    @Override
    public String getPlaceholderText(@NotNull ASTNode astNode) {
        return null;
    }

    @Override
    public boolean isCollapsedByDefault(@NotNull ASTNode astNode) {
        return false;
    }
    
    private void addFoldingRegionsFor(
            @NotNull ASTNode node, @NotNull List<FoldingDescriptor> regions) {
        IElementType nodeElementType = node.getElementType();
        if (FOLD_TYPES.contains(nodeElementType)) {
            for (TextRange textRange : getFoldingRangesFor(node)) {
                if (textRange.getLength() != 0) {
                    regions.add(new FoldingDescriptor(node, textRange));
                }
            }
        }
        ASTNode child = node.getFirstChildNode();
        while (child != null) {
            addFoldingRegionsFor(child, regions);
            child = child.getTreeNext();
        }
    }
    
    @NotNull
    private TextRange[] getFoldingRangesFor(@NotNull ASTNode node) {
        IElementType elementType = node.getElementType();
        TextRange primaryTextRange;
        if (elementType == ENTITY_DECLARATION || elementType == ARCHITECTURE_BODY
                || elementType == CASE_STATEMENT || elementType == SUBPROGRAM_BODY
                || elementType == CONFIGURATION_DECLARATION || elementType == PACKAGE_DECLARATION
                || elementType == PACKAGE_BODY) {
            primaryTextRange = getFoldingRange(
                    node.findChildByType(IS), node.findChildByType(END),
                    true, false);
            primaryTextRange = addWhitespaces(primaryTextRange, node, true, true);
        } else if (elementType == PORT_CLAUSE || elementType == GENERIC_CLAUSE
                || elementType == PORT_MAP_ASPECT || elementType == GENERIC_MAP_ASPECT
                || elementType == AGGREGATE) {
            primaryTextRange = getFoldingRange(
                    node.findChildByType(LEFT_PAREN), node.findChildByType(RIGHT_PAREN),
                    false, false);
        } else if (elementType == CONTEXT_CLAUSE) {
            Optional<ASTNode> libraryNode = ((VHDLContextClause) node.getPsi())
                    .getContextItemList().stream().map(VHDLContextItem::getLibraryClause)
                    .filter(Objects::nonNull).findFirst()
                    .map(libraryClause -> libraryClause.getNode().findChildByType(LIBRARY));
            primaryTextRange = getFoldingRange(libraryNode.orElse(node), node,
                                               !libraryNode.isPresent(), true);
            primaryTextRange = addWhitespaces(primaryTextRange, node, true, false);
        } else if (elementType == PROCESS_STATEMENT) {
            ASTNode startNode = node.findChildByType(IS);
            if (startNode == null) {
                startNode = node.findChildByType(RIGHT_PAREN);
            }
            if (startNode == null) {
                startNode = node.findChildByType(PROCESS);
            }
            primaryTextRange = getFoldingRange(startNode, node.findChildByType(END),
                                               false, false);
            primaryTextRange = addWhitespaces(primaryTextRange, node, true, true);
        } else if (elementType == IF_STATEMENT) {
            List<TextRange> ranges = new ArrayList<>();
            ASTNode startNode = node.findChildByType(THEN);
            ASTNode endNode;
            for (IElementType endType : new IElementType[] {ELSIF, ELSE, END}) {
                while (startNode != null && (endNode = node.findChildByType(
                        endType, startNode.getTreeNext())) != null) {
                    primaryTextRange = getFoldingRange(startNode, endNode, false, false);
                    primaryTextRange = addWhitespaces(primaryTextRange, node, true, true);
                    if (primaryTextRange != null) {
                        ranges.add(primaryTextRange);
                    }
                    startNode = endType == ELSIF ? node.findChildByType(THEN, endNode) : endNode;
                }
            }
            return ranges.toArray(new TextRange[0]);
        } else if (elementType == CASE_STATEMENT_ALTERNATIVE) {
            primaryTextRange = getFoldingRange(node.findChildByType(CASE_THEN), node,
                                               false, true);
            primaryTextRange = addWhitespaces(primaryTextRange, node, true, false);
        } else if (elementType == LOOP_STATEMENT) {
            primaryTextRange = getFoldingRange(
                    node.findChildByType(LOOP), node.findChildByType(END),
                    true, false);
            primaryTextRange = addWhitespaces(primaryTextRange, node, true, true);
        } else {
            primaryTextRange = node.getTextRange();
        }
        if (primaryTextRange == null) {
            return new TextRange[0];
        }
        return new TextRange[] {primaryTextRange};
    }
    
    @Nullable
    private TextRange getFoldingRange(@Nullable ASTNode startNode, @Nullable ASTNode endNode,
                                      boolean startInclusive, boolean endInclusive) {
        if (startNode == null || endNode == null) {
            return null;
        }
        int startIndex = startInclusive ?
                startNode.getStartOffset() : startNode.getTextRange().getEndOffset();
        int endIndex = Math.max(startIndex, endInclusive ?
                endNode.getTextRange().getEndOffset() : endNode.getStartOffset());
        
        return new TextRange(startIndex, endIndex);
    }
    
    @Nullable
    private TextRange addWhitespaces(
            @Nullable TextRange range, @NotNull ASTNode parentNode,
            @SuppressWarnings("SameParameterValue") boolean toStart, boolean toEnd) {
        if (range == null || range.getLength() == 0) {
            return range;
        }
        int parentStartOffset = parentNode.getStartOffset();
        CharSequence parentText = parentNode.getChars();
        int startOffset = range.getStartOffset();
        int endOffset = range.getEndOffset();
        char startCharacter = parentText.charAt(startOffset - parentStartOffset);
        if (toStart && Character.isWhitespace(startCharacter) && !isNewline(startCharacter)) {
            startOffset++;
        }
        if (toEnd) {
            if (Character.isWhitespace(parentText.charAt(endOffset - 1 - parentStartOffset))) {
                endOffset--;
            }
            int numSpaces = 0;
            char character;
            do {
                character = parentText.charAt(endOffset - numSpaces - 1 - parentStartOffset);
                if (isNewline(character)) {
                    if (startOffset < endOffset - numSpaces - 1) {
                        endOffset -= numSpaces + 1;
                    }
                    break;
                }
                numSpaces++;
            } while (startOffset < endOffset - numSpaces && Character.isWhitespace(character));
        }
        return new TextRange(startOffset, endOffset);
    }
    
    private static boolean isNewline(char character) {
        return !NOT_NEWLINE_MATCHER.reset(String.valueOf(character)).matches();
    }
}
