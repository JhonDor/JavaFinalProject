package org.globantuniversity.main;

import org.globantuniversity.data.University;
import org.globantuniversity.persistence.DataInitializer;

public class Main {
    public static void main(String[] args) {
        University myUniversity = DataInitializer.loadUniversity();


    }

    public static void printTeacherList(University university){
        for (int i = 0; i < university.getTeachersAmount(); i++) {
            System.out.println(university.getTeacherById(i));
        }
    }
}
