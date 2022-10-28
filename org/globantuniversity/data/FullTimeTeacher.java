package org.globantuniversity.data;

public class FullTimeTeacher extends Teacher {
    private int yearsOfExperience;

    public FullTimeTeacher(String name, double baseSalary, int yearsOfExperience) {
        super(name, baseSalary);
        this.yearsOfExperience = yearsOfExperience;
    }


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
