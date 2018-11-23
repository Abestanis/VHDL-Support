package com.abestanis.vhdl.psi;

import com.abestanis.vhdl.VHDLFileType;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFileFactory;

import java.util.Objects;

class VHDLElementFactory {
    static VHDLIdentifier createIdentifier(Project project, String name) {
        final VHDLFile file = createFile(project, "entity " + name + " is end;");
        final VHDLDesignUnit designUnit = (VHDLDesignUnit) file.getFirstChild();
        final VHDLEntityDeclaration entityDeclaration =
                (VHDLEntityDeclaration) Objects.requireNonNull(
                        designUnit.getLibraryUnit().getPrimaryUnit()).getDeclaration();
        return entityDeclaration.getIdentifier();
    }

    private static VHDLFile createFile(Project project, String text) {
        String name = "dummy.vhdl";
        return (VHDLFile) PsiFileFactory.getInstance(project).
                createFileFromText(name, VHDLFileType.INSTANCE, text);
    }
}
