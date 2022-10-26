package org.globantuniversity.data;

public class PartTimeTeacher extends Teacher{
    private float activeHoursPerWeek;

    public PartTimeTeacher(String name, double baseSalary, float activeHoursPerWeek) {
        super(name, baseSalary);
        this.activeHoursPerWeek = activeHoursPerWeek;
    }


    @Override
    public double salary() {
        return ((this.baseSalary / 48) * this.activeHoursPerWeek);
    }

    @Override
    public String toString() {
        return "PartTimeTeacher{" +
                "activeHoursPerWeek=" + activeHoursPerWeek +
                ", name='" + name + '\'' +
                ", baseSalary=" + baseSalary +
                ", id=" + id +
                '}';
    }
}
