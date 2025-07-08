package com.xworkz.Override.internal;

public class ProgrammingSyntax extends Syntax {
    public ProgrammingSyntax() {
        System.out.println("No argument constructor in ProgrammingSyntax");
    }

    @Override
    public void explain() {
        System.out.println("Explaining programming language syntax");
    }

    public void examples() {
        System.out.println("Providing examples of programming syntax");
    }
}
