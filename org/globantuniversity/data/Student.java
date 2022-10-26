package org.globantuniversity.data;

public class Student {
    private String name;
    private int id;
    private int idCounter = 0;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.id = idCounter;
        idCounter++;
        this.age = age;
    }
}
