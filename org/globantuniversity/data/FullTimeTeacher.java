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
        return "FullTimeTeacher{" +
                "yearsOfExperience=" + yearsOfExperience +
                ", name='" + name + '\'' +
                ", baseSalary=" + baseSalary +
                ", id=" + id +
                '}';
    }
}
