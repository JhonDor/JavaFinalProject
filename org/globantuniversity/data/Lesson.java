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
        String str ="";
        for(Student f: studentList){{
            str+= f ;
        }}
    return str;
}

    @Override
    public String toString() {
        return
                "Código de clase: " + this.id + " " + "Nombre de la clase: " + this.name + " " +
                        "Salón: " + this.classroom + " " +
                        "Profesor asignado: " + this.teacher + "\n" +
                        "Listado de estudiantes" + "\n" + students();
    }

}
