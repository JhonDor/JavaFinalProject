package org.globantuniversity.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

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

public String students(){
        String list ="";
        for(Student student: studentList){{
            list+= student;
        }}
    return list;
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

    @Override
    public String toString() {
        return
                "Código de clase: " + this.id + "\n" + "Nombre de la clase: " + this.name + "\n" +
                        "Salón: " + this.classroom + "\n" +
                        "Profesor asignado: " + this.teacher + "\n" +
                        "Listado de estudiantes" + "\n" + students();
    }

}
