package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends User {

    BookSystem bookSystem = new BookSystem();

    User user = new User() {

        public void showAllBooks() {
           showAllBooks();
        }
    };



    Scanner studentInput = new Scanner(System.in);

    public void StudentLogin() {

        boolean running = true;

        System.out.println("-----------------------------------------------");
        System.out.println("choose an option");
        System.out.println("1. See all books");
        System.out.println("2. Lend book");
        System.out.println("3.check if book is lended");
        System.out.println("4. Return book ");
        System.out.println("5. Search for book ");
        System.out.println("6. show all book info");
        System.out.println("7. Exit");
        System.out.println("write a number please");

        while (running){
            int studentOption = studentInput.nextInt();
            switch (studentOption){
                case 1:
                    System.out.println("See all books");
                bookSystem.showBooks();
                    break;
                case 2:
                    System.out.println("Lend book");
                    break;
                case 3:
                    System.out.println(" See lended book");
                    bookSystem.isBookLended();
                    break;
                case 4:
                    System.out.println("Return book");
                    break;
                case 5:
                    System.out.println("Search for book");
                    break;
                case 6:
                    System.out.println("See all Book info");
                    bookSystem.showBookInfo();
                    break;
                case 7:
                    System.out.println("Exiting");
                    running=false;
                    break;

            }
        }

    }

}
