package com.abestanis.vhdl.settings;

import com.abestanis.vhdl.VHDLIcons;
import com.abestanis.vhdl.VHDLSyntaxHighlighter;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

import javax.swing.Icon;

public class VHDLColorSettingsPage  implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Keyword", VHDLSyntaxHighlighter.KEYWORD_ATTR),
            new AttributesDescriptor("Comment", VHDLSyntaxHighlighter.COMMENT_ATTR),
            new AttributesDescriptor("Numeric literals", VHDLSyntaxHighlighter.NUMBER_ATTR),
            new AttributesDescriptor("String", VHDLSyntaxHighlighter.STRING_ATTR),
            new AttributesDescriptor("Bit string", VHDLSyntaxHighlighter.BIT_STRING_ATTR),
            new AttributesDescriptor("Octal string", VHDLSyntaxHighlighter.OCT_STRING_ATTR),
            new AttributesDescriptor("Hexadecimal string", VHDLSyntaxHighlighter.HEX_STRING_ATTR),
            new AttributesDescriptor("Character literal", VHDLSyntaxHighlighter.CHARACTER_ATTR),
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return VHDLIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new VHDLSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() { // TODO: Better example
        return "library\tieee;\n" +
                "use\tieee.std_logic_1164.all;\n" +
                "\n" +
                "entity myEnt is\n" +
                "  port(\n" +
                "    rst_an : in std_logic;\n" +
                "    clk: in std_logic;\n" +
                "    rst: in std_logic;\n" +
                "    sigIn: in std_logic_vector(3 downto 0);\n" +
                "    sigOut: out std_logic_vector(3 downto 0));\n" +
                "end entity myEnt;\n" +
                "\n" +
                "architecture myArch of myEnt is\n" +
                "\n" +
                "  signal sync_rst_r : std_logic_vector(1 downto 0);\n" +
                "  signal mySig: std_logic_vector(sigIn'range);\n" +
                "\n" +
                "begin\n" +
                "\n" +
                "  process(clk)\n" +
                "  begin\n" +
                "    if (rising_edge(clk)) then\n" +
                "      sync_rst_r <= sync_rst_r(0) & rst_an;\n" +
                "    end if;\n" +
                "  end process;\n" +
                "\n" +
                "  process(clk, sync_rst_r)\n" +
                "  begin\n" +
                "    if sync_rst_r(1) = '0' then\n" +
                "        mySig <= (others => '0');\n" +
                "    elsif (rising_edge(clk)) then\n" +
                "      if (rst = '1') then\n" +
                "        mySig <= (others => '0');\n" +
                "      else\n" +
                "        mySig <= sigIn;\n" +
                "      end if;\n" +
                "    end if;\n" +
                "  end process;\n" +
                "\n" +
                "sigOut <= mySig;\n" +
                "\n" +
                "end architecture;";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "VHDL";
    }
}
