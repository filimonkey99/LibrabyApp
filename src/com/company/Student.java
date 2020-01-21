package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student extends User {

    private static List<Book> borrowedBooks=new ArrayList<>();

    public static void addBook(Book book){
        borrowedBooks.add(book);
    }

    public static List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

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
        System.out.println("5. See all my books" );
        System.out.println("6. Search for book ");
        System.out.println("7. show all book info");
        System.out.println("8. Exit");
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
                    bookSystem.lendBook();
                    break;
                case 3:
                    System.out.println(" See Available i book");
                    bookSystem.printAvailabeBooks();
                    break;
                case 4:
                    System.out.println("Return book");
                    bookSystem.returnBook();
                    break;
                case 5:
                    System.out.println("See all my lended books");
                    bookSystem.showMyBooks();
                    break;
                case 6:
                    System.out.println("Search for book");
                    bookSystem.searchBook();
                    break;
                case 7:
                    System.out.println("See all Book info");
                    System.out.println("write the name of the book");
                    bookSystem.showBookInfo();
                    break;
                case 8:
                    System.out.println("Exiting");
                    running=false;
                    break;

            }
        }

    }

}
