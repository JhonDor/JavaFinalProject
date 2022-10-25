package org.globantuniversity;

public class FullTimeTeacher extends Teacher {
    private int yearsOfExperience;

    public FullTimeTeacher(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public double salary() {

        return (this.baseSalary *(this.yearsOfExperience * 1.1));
    }
}
