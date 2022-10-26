package org.globantuniversity.data;

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

    public void registerTeacher(Teacher teacher){
        this.teacherList.add(teacher);
    }

    public void registerStudent(Student student){
        this.studentList.add(student);
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }
    public Teacher getTeacherById(int id) {
        return teacherList.get(id);
    }

    public int getTeachersAmount(){
        return teacherList.size();
    }
}
