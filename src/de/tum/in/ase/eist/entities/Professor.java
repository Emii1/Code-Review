package de.tum.in.ase.eist.entities;

public class Professor {

    private  String persNr;
    private  String name;
    private  int age;
    private  int semester;
    private  String email;

    // TODO 1.1 : - Bob is not good at Object Orientated Programming - fix it

    // TODO 1.2 : Refactoring - Apply the template method design pattern on Student and Professor to prevent duplicated code

    public Professor( String name,  int age, String email, String persNr, int semester) {
        this.persNr = persNr;
        this.name = name;
        this.age = age;
        this.email = email;
        this.semester = semester;
    }
}
