package org.globantuniversity.data;

public class Student {
    private String name;
    private int age;
    protected static int idCounter = 1;
    protected int id;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = idCounter;
        idCounter++;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Id: " + id + " " +
                "Nombre" + name + "\n";
    }
}
