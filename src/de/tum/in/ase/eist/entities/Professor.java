package de.tum.in.ase.eist.entities;

public class Professor {

    private final String persNr;
    private final String name;
    private final int age;
    private final int semester;
    private final String email;

    // TODO 1.1 : - Bob is not good at Object Orientated Programming - fix it

    // TODO 1.2 : Refactoring - Apply the template method design pattern on Student and Professor to prevent duplicated code

    public Professor(final String name, final int age,final String email,final String persNr, final int semester) {
        this.persNr = persNr;
        this.name = name;
        this.age = age;
        this.email = email;
        this.semester = semester;
    }
}
