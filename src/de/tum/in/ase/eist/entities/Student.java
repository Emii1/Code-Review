package de.tum.in.ase.eist.entities;

public class Student {


    private final  String matrNr;
    private final String name;
    private final int age;
    private final int semester;
    private final String email;

    // TODO 1.1 : Bob is not good at Object Orientated Programming - fix it
  	// TODO 1.1 : Instead of implementing void setSemester(int i), implement void increaseSemester()

    // TODO 1.2 : Refactoring - Apply the template method design pattern on Student and Professor to prevent duplicated code

    public Student(final String name,final int age,final String email, final String matrNr,final int semester) {
        this.matrNr = matrNr;
        this.name = name;
        this.age = age;
        this.semester = semester;
        this.email = email;
    }

    public void increaseSemester(){

    }
    public String getMatrNr() {
        return matrNr;
    }
}
