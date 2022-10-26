package org.globantuniversity.data;

public abstract class Teacher {
    protected String name;
    protected double baseSalary;
    protected int id;
    protected static int idCounter = 1;

    public Teacher(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.id = idCounter;
        idCounter++;

    }

    public abstract double salary();

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", baseSalary=" + baseSalary +
                ", id=" + id;
    }
}
