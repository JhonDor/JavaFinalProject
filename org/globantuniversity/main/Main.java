package org.globantuniversity.main;

import org.globantuniversity.data.Lesson;
import org.globantuniversity.data.University;
import org.globantuniversity.persistence.DataInitializer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        University myUniversity = DataInitializer.loadUniversity();
        Scanner scan = new Scanner(System.in);
        boolean exit = false;

        do {
            System.out.println("Bienvenido a " + myUniversity.getName());
            System.out.println("   1. Mostrar la lista de profesores");
            System.out.println("   2. Mostrar todas las clases");
            System.out.println("   3. Matricular un estudiante");
            System.out.println("   4. Creaar una nueva clase");
            System.out.println("   5. Mostrar todas las clases de un estudiante");
            System.out.println("   6. Salir");

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
                    System.out.println(myUniversity.getStudentById(1));
                    break;
                case "4":
                    System.out.println("hola3");
                    break;
                case "5":
                    System.out.println("hola4");

                    break;
                case "6":
                    exit = true;
                    break;
                default:
                    System.out.println("Por favor ingrese una opción válida");
                    break;
            }

        } while (!exit);


    }


    public static void printTeacherList(University university) {
        for (int i = 0; i < university.getTeachersAmount(); i++) {
            System.out.println(university.getTeacherById(i));
        }
    }
    public static void printAllLessons(University university){
        System.out.println("Las clases disponibles actualmente son: " + "\n");
        for (int i = 0; i < university.getLessonsAmount(); i++) {
            System.out.println(university.getLessonByIndex(i).getId() + " " + university.getLessonByIndex(i).getName());
        }
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        do{
            System.out.println("Las opciones disponibles en este submenu son:");
            System.out.println("1. Listar toda la información de una clase");
            System.out.println("2. Volver al menu anterior");
            String option = scan.nextLine();
            //Lesson lesson = university.getLessonById(Integer.parseInt(option));
            //int option2 = scan.nextInt();
            switch (option){
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
        }while(!exit);

    }
    public static void printLessonDetails(University university){
        Scanner scan = new Scanner(System.in);
        System.out.println("Escriba el id de la clase para listar su información");
        int id = scan.nextInt();
        //scan = new Scanner(System.in);
        //university.getLessonById(id).getStudentList().forEach(System.out::println);
        System.out.println(university.getLessonById(id));
    }
    /**

    public static void printLessonDetails(University university) {
        Scanner scan = new Scanner(System.in);
        String option = scan.nextLine();
        int option2 = scan.nextInt();
        Lesson id = university.getLessonByIndex(Integer.parseInt(option));
        System.out.println(university.getLessonById(option2));
    }**/
}
