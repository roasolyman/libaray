/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.libaray_system_app;

import java.util.Scanner;

/**
 *
 * @author thinktec
 */
public class Libaray_system_app {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        library lib = new library();
        while (true) {
            System.out.println("Console Menu");
            System.out.println("1. Show All Books");
            System.out.println("2. Show All Students");
            System.out.println("3. Add Book ");
            System.out.println("4. Add Student ");
            System.out.println("5. Search Book by title ");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    for (Book b : lib.getBooks()) {
                        System.out.println(b.getInfo());
                    }
                }
                case 2 -> {
                    for (student b : lib.getstudents()) {
                        System.out.println(b.getInfo());
                    }
                }
                case 3 -> {
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter Author Name: ");
                    String authorName = scanner.nextLine();

                    System.out.print("Enter Book Number: ");
                    int bookNumber = scanner.nextInt();

                    System.out.print("Enter Book Genre: ");
                    String genre = scanner.nextLine();

                    System.out.print("Enter Book Version: ");
                    int version = scanner.nextInt();

                    Book book = new Book(title, authorName, bookNumber, genre, version);
                    lib.addBook(book);
                    System.out.println("Book  Added");
                    System.out.println("**************");
                }
                case 4 -> {
                    System.out.print("Enter Student ID: ");
                    int studentId = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Enter Student Name: ");
                    String studentName = scanner.nextLine();

                    System.out.print("Enter Student Address: ");
                    String studentAddress = scanner.nextLine();

                    System.out.print("Enter Student Major: ");
                    String studentMajor = scanner.nextLine();

                    student student = new student(studentId, studentName, studentAddress, studentMajor);
                    lib.Addstudent(student);
                    System.out.println("Student Adde");
                    System.out.println("Student Created:\n" + student);
                }
                case 5 -> {
                    String title = scanner.nextLine();
                    for (Book b : lib.getBooks()) {
                        if (b.getTitle().equals(title)) {
                            System.out.println(b.getInfo());
                        }
                    }
                }
                case 6 -> {
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Please enter a valid option.");
            }

            System.out.println();
        }
    }
}
