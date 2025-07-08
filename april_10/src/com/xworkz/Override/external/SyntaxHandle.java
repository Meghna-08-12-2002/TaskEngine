package com.xworkz.Override.external;

import com.xworkz.Override.internal.ProgrammingSyntax;
import com.xworkz.Override.internal.Syntax;

public class SyntaxHandle {
    public SyntaxHandle() {
        System.out.println("No argument constructor in SyntaxHandler");
    }

    public void manageSyntax(Syntax syntax) {
        if (syntax != null) {
            syntax.explain();
            if (syntax instanceof ProgrammingSyntax) {
                ProgrammingSyntax prog = (ProgrammingSyntax) syntax;
                prog.examples();
            } else {
                System.out.println("This is basic syntax explanation");
            }
        } else {
            System.out.println("Syntax is null");
        }
    }
}
