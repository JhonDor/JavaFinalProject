package org.globantuniversity;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Teacher> teacherList;
    private List<Student> studentList;
    private List<Lesson> lessonList;

    public University(String name) {
        this.name = name;
        this.teacherList = new ArrayList<>();
        this.studentList = new ArrayList<>();
        this.lessonList = new ArrayList<>();
    }
}
