package org.globantuniversity.data;

/**
 * @author jhon.dorado@globant.com
 * @version 1.00.00
 * @since 1.00.00
 * this is the class used to create part-time teachers it extends the abstract class teacher
 * activeHoursPeerWeek is the amount of hours a part-time teacher works
 */
public class PartTimeTeacher extends Teacher {
    private float activeHoursPerWeek;

    public PartTimeTeacher(String name, double baseSalary, float activeHoursPerWeek) {
        super(name, baseSalary);
        this.activeHoursPerWeek = activeHoursPerWeek;
    }

    /**
     * this method calculates the salary of a part-time teacher
     * @author jhon.dorado@globant.com
     * @version 1.00.00
     * @since 1.00.00
     * @return the salary of a full part-time teacher
     */
    @Override
    public double salary() {

        return ((this.baseSalary / 48) * this.activeHoursPerWeek);
    }

    @Override
    public String toString() {
        return "Id: " + this.id + ", " + "Cargo: Profesor@ a tiempo parcial" + ", " +
                "Horas disponibles por semana: " + this.activeHoursPerWeek + ", " +
                "Nombre completo: " + this.name + ", " +
                "Salario : " + String.format("%.3f", this.salary());
    }
}
