package org.globantuniversity.data;

public abstract class Teacher {
    protected String name;
    protected double baseSalary;

    protected static int idCounter = 1;
    protected int id;

    public Teacher(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.id = idCounter;
        idCounter++;

    }

    public abstract double salary();

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", baseSalary=" + baseSalary +
                ", id=" + id;
    }
}
