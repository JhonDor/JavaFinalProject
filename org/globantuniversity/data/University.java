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

    public String getName() {
        return name;
    }

    public void registerTeacher(Teacher teacher) {
        this.teacherList.add(teacher);
    }

    public void registerStudent(Student student) {
        this.studentList.add(student);
    }

    public void registerLesson(Lesson lesson) {
        this.lessonList.add(lesson);
    }


    public Teacher getTeacherById(int id) {
        Teacher result = null;
        for (Teacher teacher : teacherList) {
            if (teacher.getId() == id) {
                result = teacher;
            }
        }
        return result;
    }

    public Student getStudentById(int id) {
        Student result = null;
        for (Student student : studentList) {
            if (student.getId() == id) {
                result = student;
            }
        }
        return result;
    }

    public int getTeachersAmount() {
        return teacherList.size();
    }
    public Teacher getTeacherByIndex(int i) {
        return teacherList.get(i);
    }

    public Lesson getLessonByIndex(int i) {
        return lessonList.get(i);
    }

    public Lesson getLessonById(int id) {
        Lesson result = null;
        for (Lesson lesson : lessonList) {
            if (lesson.getId() == id) {
                result = lesson;
            }
        }
        return result;
    }

    public int getLessonsAmount() {
        return lessonList.size();
    }

    public ArrayList<Lesson> FindStudentLessons(int id) {
        ArrayList<Lesson> enrolledLessons = new ArrayList<>();

        for (Lesson lesson : this.lessonList) {
            boolean studentFound = lesson.getStudentList().contains(getStudentById(id));
            if (studentFound == true & getStudentById(id) != null) {
                enrolledLessons.add(lesson);
            }
        }
        return enrolledLessons;

    }
}