package org.globantuniversity.main;

import org.globantuniversity.data.Lesson;
import org.globantuniversity.data.Student;
import org.globantuniversity.data.Teacher;
import org.globantuniversity.data.University;
import org.globantuniversity.persistence.DataInitializer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        University myUniversity = DataInitializer.loadUniversity();
        Scanner scan = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Bienvenido a " + myUniversity.getName());
            System.out.println("   1. Mostrar la lista de profesores");
            System.out.println("   2. Mostrar todas las clases");
            System.out.println("   3. Matricular un estudiante");
            System.out.println("   4. Crear una nueva clase");
            System.out.println("   5. Mostrar todas las clases de un estudiante");
            System.out.println("   6. Salir");
            try {


                String option = scan.nextLine();
                scan = new Scanner(System.in);
                switch (option) {
                    case "1":
                        printTeacherList(myUniversity);
                        break;
                    case "2":
                        printAllLessons(myUniversity);
                        break;
                    case "3":
                        registerStudent(myUniversity);
                        break;
                    case "4":
                        createLesson(myUniversity);
                        break;
                    case "5":
                        System.out.println(myUniversity.FindStudentLesson(1));


                        break;
                    case "6":
                        exit = true;
                        break;
                    default:
                        System.out.println("Por favor ingrese una opción válida");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("El tipo de dato recibido no fue el esperado, por favor verifique la información");
            }


        }}


        public static void printTeacherList (University university){
            for (int i = 0; i < university.getTeachersAmount(); i++) {
                System.out.println(university.getTeacherById(i));
            }
        }

        public static void printAllLessons (University university){
            System.out.println("Las clases disponibles actualmente son: " + "\n");
            for (int i = 0; i < university.getLessonsAmount(); i++) {
                System.out.println(university.getLessonByIndex(i).getId() + " " + university.getLessonByIndex(i).getName());
            }
            Scanner scan = new Scanner(System.in);
            boolean exit = false;
            do {
                System.out.println("Las opciones disponibles en este submenu son:");
                System.out.println("1. Listar toda la información de una clase");
                System.out.println("2. Volver al menu anterior");
                String option = scan.nextLine();
                //Lesson lesson = university.getLessonById(Integer.parseInt(option));
                //int option2 = scan.nextInt();
                switch (option) {
                    case "1":
                        printLessonDetails(university);
                        break;
                    case "2":
                        exit = true;
                        break;
                    default:
                        System.out.println("Por favor ingrese una opción válida");
                        break;
                }
            } while (!exit);

        }

        public static void printLessonDetails (University university){
            Scanner scan = new Scanner(System.in);
            System.out.println("Escriba el id de la clase para listar su información");
            int id = scan.nextInt();
            //scan = new Scanner(System.in);
            //university.getLessonById(id).getStudentList().forEach(System.out::println);
            System.out.println(university.getLessonById(id));
        }

        public static void registerStudent (University university){
            System.out.println("Ingrese el nombre del nuevo estudiante");
            Scanner scan = new Scanner(System.in);
            String name = scan.nextLine();
            System.out.println("Ingrese la edad del nuevo estudiante");
            scan = new Scanner(System.in);
            int age = scan.nextInt();
            System.out.println("Escriba el id de la clase donde dese añadir al nuevo estudiante");
            scan = new Scanner(System.in);
            int lessonId = scan.nextInt();

            Student student = new Student(name, age);
            university.getLessonById(lessonId).addStudent(student);

            System.out.println("El estudiante ha sido matriculado en la siguiente clase: " + university.getLessonById(lessonId));
        }

        public static void createLesson (University university){
            Scanner scan = new Scanner(System.in);
            System.out.println("Ingrese el nombre de la nueva clase");
            String name = scan.nextLine();
            System.out.println("Ingrese el salon");
            scan = new Scanner(System.in);
            String classroom = scan.nextLine();
            System.out.println("Ingrese el id del profesor asignado");
            scan = new Scanner(System.in);
            int teacherId = scan.nextInt();
            Teacher teacher = university.getTeacherById(teacherId);
            if (teacher != null) {
                Lesson lesson = new Lesson(name, classroom, teacher);
                university.registerLesson(lesson);
                addStudentToLesson(university, lesson);
            } else {
                System.out.println("Por favor verifique el id del profesor");
            }
            ;


        }

        public static void addStudentToLesson (University university, Lesson lesson){
            Scanner scan = new Scanner(System.in);
            boolean exit = false;
            do {
                System.out.println("1. Para añadir un nuevo estudiante");
                System.out.println("2. Para salir");
                Scanner scan2 = new Scanner(System.in);
                String option = scan2.nextLine();
                switch (option) {
                    case "1":
                        System.out.println("Escriba el id del estudiante que desea agregar");
                        int studentId = scan.nextInt();
                        Student student = university.getStudentById(studentId);
                        if (student != null) {
                            lesson.addStudent(student);
                            System.out.println("Usted agreago a " + lesson.getStudentById(studentId).getName() + " a la clase");
                        } else {
                            System.out.println("No se pudo agregar el estudiante, verifique el id del estudiante");
                        }
                        break;
                    case "2":
                        exit = true;
                        break;
                    default:
                        System.out.println("q");
                        break;
                }
            } while (!exit);
        }
    }

