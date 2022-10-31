package org.globantuniversity.data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jhon.dorado@globant.com
 * @version 1.00.00
 * @since 1.00.00
 * name is the name of the lesson
 * classroom is the classroom assigned to the lesson
 * studentList is the list of students assigned to the lesson
 * teacher is the teacher assigned to the lesson
 * id is the id of the lesson, will be used to find a given lesson
 * idCounter is a counter to create the lesson´s id automatically
 */
public class Lesson {
    private String name;
    private String classroom;
    private List<Student> studentList;
    private Teacher teacher;
    private int id;
    private static int idCounter = 1001;

    public Lesson(String name, String classroom, Teacher teacher) {
        this.name = name;
        this.classroom = classroom;
        this.studentList = new ArrayList<>();
        this.teacher = teacher;
        this.id = idCounter;
        idCounter++;
    }

    /**
     * @author jhon.dorado@globant.com
     * @version 1.00.00
     * @since 1.00.00
     * this method is used to add a student to list of students
     * @param student is the student you will add to the list of students in the lesson
     */
    public void addStudent(Student student) {
        this.studentList.add(student);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    /**
     * @author jhon.dorado@globant.com
     * @version 1.00.00
     * @since 1.00.00
     * this method is used in the method toString, it transforms studentList into a string and makes the printing easier
     * @return the list of students as a string
     */
    public String printStudents() {
        String list = "";
        for (Student student : studentList) {
            {
                list += student;
            }
        }
        return list;
    }

    /**
     * this method finds a student inside a lesson using the student´s id
     * @param id is the id of the student
     * @return the student that matching the id provided or null if there is no matching id
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
     * this method verifies if the student is already registered in the lesson
     * @param id is the id of the student
     * @return true if the student is already registered in the lesson or false if isn´t
     */
    public boolean checkIfStudentIsInLesson(int id){
        boolean result = false;
        if(studentList.contains(getStudentById(id))){
            result = true;
        }

        return result;
    }


    @Override
    public String toString() {
        return
                "Código de clase: " + this.id + "\n" + "Nombre de la clase: " + this.name + "\n" +
                        "Salón: " + this.classroom + "\n" +
                        "Profesor asignado: " + this.teacher + "\n" +
                        "Listado de estudiantes" + "\n" + printStudents();
    }

}
