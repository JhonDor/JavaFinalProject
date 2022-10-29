package org.globantuniversity.data;

/**
 * @author jhon.dorado@globant.com
 * @version 1.00.00
 * @since 1.00.00
 * name is the name of the student
 * age is the age of the student
 * id is the id of the student
 * idCounter is a counter that will be used to create automatically the student´s id
 */
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
        return "Id: " + this.id + ", " +
                "Nombre: " + this.name + ", " + "Edad: " + this.age + "\n";
    }
}
