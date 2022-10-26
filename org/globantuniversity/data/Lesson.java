package org.globantuniversity.data;

import java.util.ArrayList;
import java.util.List;

public class Lesson {
    private String name;
    private String classroom;
    private List<Student> studentList;    private Teacher teacher;

    public Lesson(String name, String classroom, Teacher teacher) {
        this.name = name;
        this.classroom = classroom;
        this.studentList = new ArrayList<>();
        this.teacher = teacher;
    }
}
