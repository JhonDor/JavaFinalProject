package org.globantuniversity.data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author      jhon.dorado@globant.com
 * @version     1.00.00
 * @since       1.00.00
 * name is the name of the university
 * teacherList is an arraylist containing all the teachers in the university
 * studentList is an arraylist containing all the teachers in the university
 * lessonList is an arraylist containing all the lessons in the university
 */
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

    /**
     * @author jhon.dorado@globant.com
     * @version 1.00.00
     * @since 1.00.00
     *This method is used to add a teacher to teacherList 
     * @param teacher is the teacher you want to add to teacherList
     */
    public void registerTeacher(Teacher teacher) {
        this.teacherList.add(teacher);
    }

    /**
     * @author jhon.dorado@globant.com
     * @version 1.00.00
     * @since 1.00.00
     * This method is used to add a student to StudentList
     * @param student is the student to add to studentList
     */
    public void registerStudent(Student student) {
        this.studentList.add(student);
    }

    /**
     * @author jhon.dorado@globant.com
     * @version 1.00.00
     * @since 1.00.00
     * This method is used to add a lesson to lessonList
     * @param lesson is the lesson to add to lessonList
     */
    public void registerLesson(Lesson lesson) {
        this.lessonList.add(lesson);
    }

    /**
     * @author jhon.dorado@globant.com
     * @version 1.00.00
     * @since 1.00.00
     * this method is used to find a teacher through the id
     * @param id is the id of the teacher you want to find
     * @return the teacher who has the id searched or null if the method doesn't find a matching teacher
     */
    public Teacher getTeacherById(int id) {
        Teacher result = null;
        for (Teacher teacher : teacherList) {
            if (teacher.getId() == id) {
                result = teacher;
            }
        }
        return result;
    }

    /**
     * @author jhon.dorado@globant.com
     * @version 1.00.00
     * @since 1.00.00
     * this method is used to find a student through the id
     * @param id is the id of the student you want to find
     * @return the student who has the id searched or null if the method doesn't find a matching student
     */
    public Student getStudentById(int id) {
        Student result = null;
        for (Student student : studentList) {
            if (student.getId() == id) {
                result = student;
            }
        }
        return result;
    }

    /**
     * @author jhon.dorado@globant.com
     * @version 1.00.00
     * @since 1.00.00
     * This method is used to get how many teachers are in teacherList
     * @return the size of teacherList
     */
    public int getTeachersAmount() {
        return teacherList.size();
    }

    /**
     * @author jhon.dorado@globant.com
     * @version 1.00.00
     * @since 1.00.00
     * This method is used to find the position of a teacher in the array
     * @param i is the position in the array
     * @return the position of the teacher
     */
    public Teacher getTeacherByIndex(int i) {
        return teacherList.get(i);
    }

    /**
     * @author jhon.dorado@globant.com
     * @version 1.00.00
     * @since 1.00.00
     * This method is used to find the position of a lesson in the array
     * @param i is the position in the array
     * @return the position of the lesson
     */
    public Lesson getLessonByIndex(int i) {
        return lessonList.get(i);
    }
    /**
     * @author jhon.dorado@globant.com
     * @version 1.00.00
     * @since 1.00.00
     * this method is used to find a lesson through the id
     * @param id is the id of the lesson you want to find
     * @return the lesson who has the id searched or null if the method doesn't find a matching lesson
     */
    public Lesson getLessonById(int id) {
        Lesson result = null;
        for (Lesson lesson : lessonList) {
            if (lesson.getId() == id) {
                result = lesson;
            }
        }
        return result;
    }
    /**
     * @author jhon.dorado@globant.com
     * @version 1.00.00
     * @since 1.00.00
     * This method is used to get how many lessons are in lessonList
     * @return the size of lessonList
     */
    public int getLessonsAmount() {
        return lessonList.size();
    }

    /**
     * @author jhon.dorado@globant.com
     * @version 1.00.00
     * @since 1.00.00
     * this method is used to find all the lessons in which a student is included
     * @param id is the id of the student
     * @return all the lessons where the given student is included
     */
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