package org.globantuniversity;

public class PartTimeTeacher extends Teacher{
    private float activeHoursPerWeek;


    @Override
    public double salary() {
        return ((this.baseSalary / 48) * this.activeHoursPerWeek);
    }
}
