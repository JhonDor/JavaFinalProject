package org.globantuniversity.data;

/**
 * @author jhon.dorado@globant.com
 * @version 1.00.00
 * @since 1.00.00
 * this is the class used to create full time teachers it extends the abstract class teacher
 * yearsOfExperience is the amount of years of experience the teacher has
 */
public class FullTimeTeacher extends Teacher {
    private int yearsOfExperience;

    public FullTimeTeacher(String name, double baseSalary, int yearsOfExperience) {
        super(name, baseSalary);
        this.yearsOfExperience = yearsOfExperience;
    }

    /**
     * this method calculates the salary of a full time teacher
     * @author jhon.dorado@globant.com
     * @version 1.00.00
     * @since 1.00.00
     * @return the salary of a full time teacher
     */

    @Override
    public double salary() {

        return (this.baseSalary *(this.yearsOfExperience * 1.1));
    }

    @Override
    public String toString() {
        return "Id: " + this.id + ", " + "Cargo: Profesor@ a tiempo completo" + ", " +
                "Años de experiencia: " + this.yearsOfExperience + ", " +
                "Nombre completo: " + this.name + ", " +
                "Salario : " + String.format("%.3f", this.salary());
    }
}
