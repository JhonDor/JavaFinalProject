package org.globantuniversity.persistence;

import org.globantuniversity.data.*;

public class DataInitializer {
    public static University loadUniversity() {
        University myUniversity = new University("Universidad Globant");
        loadStudentsIntoUniversity(myUniversity);
        loadTeachersIntoUniversity(myUniversity);
        return myUniversity;
    }

    private static void loadStudentsIntoUniversity(University university) {
        Student student1 = new Student("Jhon Dorado", 25);
        Student student2 = new Student("Harol Morales", 20);
        Student student3 = new Student("Carlos Restrepo", 18);
        Student student4 = new Student("Juan Gomez", 26);
        Student student5 = new Student("Camila Martinez", 20);
        Student student6 = new Student("Patricia Escobar", 18);
        university.registerStudent(student1);
        university.registerStudent(student2);
        university.registerStudent(student3);
        university.registerStudent(student4);
        university.registerStudent(student5);
        university.registerStudent(student6);
    }

    private static void loadTeachersIntoUniversity(University university) {
        Teacher teacher1 = new FullTimeTeacher("Juan Restrepo", 5000000, 5);
        Teacher teacher2 = new FullTimeTeacher("Juan Torres", 5000000, 3);
        Teacher teacher3 = new PartTimeTeacher("Natalia Castro", 5000000, 25);
        Teacher teacher4 = new PartTimeTeacher("María Arango", 5000000, 30);

        university.registerTeacher(teacher1);
        university.registerTeacher(teacher2);
        university.registerTeacher(teacher3);
        university.registerTeacher(teacher4);
    }

    private static void loadLessonsIntoUniversity(University university) {
        Lesson lesson1 = new Lesson("Calculus", "101", university.getTeacherById(1));
        Lesson lesson2 = new Lesson("Physics", "101", university.getTeacherById(2));
        Lesson lesson3 = new Lesson("Sciences", "101", university.getTeacherById(3));
        Lesson lesson14 = new Lesson("Stadistics", "101", university.getTeacherById(4));
    }

}


