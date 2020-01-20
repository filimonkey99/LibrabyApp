package com.company;

import java.util.Scanner;

public class Librarian extends User {

    BookSystem bookSystem = new BookSystem();

    User user = new User() {

        public void showAllBooks() {
           showAllBooks();
        }
    };

    Scanner librarianInput = new Scanner(System.in);

    public void LibrarianLogin() {

        boolean running = true;

        System.out.println("-----------------------------------------------");
        System.out.println("choose an option");
        System.out.println("1. See all books");
        System.out.println("2. See Available book");
        System.out.println("3. See Students ");
        System.out.println("4. Search for book ");
        System.out.println("5. Show all book info");
        System.out.println("6. Exit");
        System.out.println("write a number please");

        while (running) {
            int librarianOption = librarianInput.nextInt();
            switch (librarianOption) {
                case 1:
                    System.out.println("See all books");
                    bookSystem.showBooks();
                    break;
                case 2:
                    System.out.println("See Available books");
                    bookSystem.printAvailabeBooks();
                    break;
                case 3:
                    System.out.println("See students");
                    break;
                case 4:
                    System.out.println("Search for book");
                    bookSystem.searchBook();
                    break;
                case 5:
                    System.out.println("See all Book info");
                    bookSystem.showBookInfo();
                    break;
                case 6:
                    System.out.println("Exiting");
                    running = false;
                    break;


            }
        }

    }
}
