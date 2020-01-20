package com.company;

import java.util.Scanner;

public class Librarian extends User {

    BookSystem bookSystem = new BookSystem();

    User user = new User() {
        @Override
        public void showAllBooks() {
            super.showAllBooks();
        }
    };

    Scanner librarianInput = new Scanner(System.in);

    public void LibrarianLogin() {

        boolean running = true;

        System.out.println("-----------------------------------------------");
        System.out.println("choose an option");
        System.out.println("1. See all books");
        System.out.println("2. See Lended book");
        System.out.println("3. See Students ");
        System.out.println("4. Exit");
        System.out.println("write a number please");

        while (running) {
            int librarianOption = librarianInput.nextInt();
            switch (librarianOption) {
                case 1:
                    System.out.println("See all books");
                    bookSystem.showBooks();
                    break;
                case 2:
                    System.out.println("See Lended books");
                    break;
                case 3:
                    System.out.println("See students1");
                    break;
                case 4:
                    System.out.println("Exiting");
                    running = false;
                    break;

            }
        }

    }
}
