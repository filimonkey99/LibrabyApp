package com.company;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Library {

    ArrayList<Book> books = new ArrayList<>();

    Student student = new Student();
    Librarian librarian = new Librarian();
    Book book = new Book();

    Scanner input = new Scanner(System.in);
    Scanner studentUserName = new Scanner(System.in);
    Scanner studentPassword = new Scanner(System.in);
    Scanner librarianUserName = new Scanner(System.in);
    Scanner librarianPassword = new Scanner(System.in);


    public void ShowOptions() {


        boolean running = true;


        System.out.println("welcome to Florinds library");
        System.out.println("-----------------------------------------------");
        System.out.println("choose an option");
        System.out.println("1. Student login");
        System.out.println("2. librarian login");
        System.out.println("3. Exit");


        while (running) {
            String option = input.nextLine();
            switch (option) {
                case "1":
                    System.out.println("write username: ");
                    String studUseName = studentUserName.nextLine();
                    System.out.println("write password: ");
                    String studPass = studentPassword.nextLine();


                    if (studUseName.equals("student") && studPass.equals("1234")) {
                        System.out.println("welcome student what would you like to do");
                        student.StudentLogin();
                    } else {
                        System.out.println("wrong password or username");
                        running=false;
                    }
                    break;
                case "2":

                    System.out.println("write username: ");
                    String libUseName = librarianUserName.nextLine();
                    System.out.println("write password: ");
                    String libPass = studentUserName.nextLine();


                    if (libUseName.equals("admin") && libPass.equals("admin")) {

                        System.out.println("welcome librarian what would you like to do");
                        librarian.LibrarianLogin();
                    } else {
                        System.out.println("wrong password or username");
                        running=false;
                    }


                    break;
                case "3":
                    System.out.println("Thank you come again");
                    running = false;
                    break;

            }
        }


    }


}
