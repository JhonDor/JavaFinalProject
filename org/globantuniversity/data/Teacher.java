package org.globantuniversity.data;

/**
 * @author jhon.dorado@globant.com
 * @version 1.00.00
 * @since 1.00.00
 * this is the abstract class used to create different types ot teachers
 * name is the name of the teacher
 * baseSalary is the base salary of the teacher
 * idCounter is a counter used to create the teacher's id automatically
 * id is the id of the teacher
 */
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

    /**
     * @author jhon.dorado@globant.com
     * @version 1.00.00
     * @since 1.00.00
     *this method is used to determine the real salary of the teacher
     */
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
