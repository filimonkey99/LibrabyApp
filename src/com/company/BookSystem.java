package com.company;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookSystem {
    private List<Book> books;
    private Scanner scr = new Scanner(System.in);

    public BookSystem() {
        books = new ArrayList<Book>();
        addBooks();

    }

    public void addBooks() {

        books.add(new Book("Crime and punishment", "Freydor Dostoyevski",
                "Crime and Punishment is a novel by the Russian author Fyodor Dostoevsky. " +
                        "It was first published in the literary journal The Russian Messenger in twelve monthly installments during 1866. " +
                        "It was later published in a single volume." +
                        " It is the second of Dostoevsky's full-length novels following his return from ten years of exile in Siberia. ", true));


        books.add(new Book("Thus speaks Zarathustra", "Frederich Nistzche", "Thus Spoke Zarathustra: A Book for All and None is a philosophical novel by German philosopher" +
                " Friedrich Nietzsche, " +
                "composed in four parts written between 1883 and 1885 and published between 1883 and 1891", true));


        books.add(new Book("The selfish Gene", "Richard Dawkinns", "The Selfish Gene is a 1976 book on evolution by the biologist Richard Dawkins, " +
                "in which the author builds upon the principal theory of George C. Williams's Adaptation and Natural Selection." +
                " Dawkins uses the term selfish gene as a way of expressing the gene-centred view of evolution, popularising ideas developed during the 1960s", true));


        books.add(new Book("The Kama sutra", "unknown", "The Kama Sutra is an ancient Indian Sanskrit text on sexuality, " +
                "eroticism and emotional fulfillment in life." +
                " Attributed to Vātsyāyana, the Kama Sutra is neither exclusively nor predominantly a sex manual on sex positions," +
                " but written as a guide to the art-of-living well, the nature of love, finding a life partner," +
                " maintaining one's love life, and other aspects pertaining to pleasure-oriented faculties of human life." +
                " Kamasutra is the oldest surviving Hindu text on erotic love", true));

        books.add(new Book("The Bible", "unknown", "The Bible is a compilation of 66 books and letters written by more than 40 authors during a period of approximately 1,500 years. " +
                "Its original text was communicated in just three languages: Hebrew, koine or common Greek, and Aramaic. " +
                "The Old Testament was written for the most part in Hebrew, with a small percentage in Aramaic. " +
                "The New Testament was written in Greek.", true));


    }

    public void showBooks() {
        for (Book book : books) {
            System.out.printf("Book name :%s , Book author: %s ", book.getBookName(), book.getBookAuthor());
        }

    }

    public void showBookInfo() {
        String bookname = scr.nextLine();
        for (Book book : books) {
            if (book.getBookName().toLowerCase().contains(bookname.toLowerCase())) {

                System.out.printf("Book name :%s , Book author: %s, Book description: %s, Book availability: %b ",
                        book.getBookName(), book.getBookAuthor(), book.getDescription(), book.getAvailability());
            }
        }
    }

    public Book searchBook() {
        String bookname = scr.nextLine();
        for (Book book : books) {
            if (book.getBookName().toLowerCase().contains(bookname.toLowerCase())) {

                System.out.printf("Results: %s ", book.getBookName());
                return book;
            }
        }
        return null;
    }


    public void printAvailabeBooks() {
        for (Book book : books) {
            if (book.getAvailability()) {
                System.out.printf("Book: %s has Book availability: %b ", book.getBookName(), book.getAvailability());

            }
        }


    }

    public Book lendBook() {
        Book book = searchBook();

        if (book.getAvailability()) {
            book.setAvailability(false);
            System.out.println();
            System.out.printf("You borrowed: %s, %b ", book.getBookName(), book.getAvailability());
            Student.addBook(book);
        }
        return null;
    }


    public void returnBook() {

        Book book =searchBook();

        if (!book.getAvailability()){
            book.setAvailability(true);
            System.out.println();
            System.out.printf("you returned: %s, %b", book.getBookName(), book.getAvailability());


        }


    }
    public void showMyBooks(){
        for ( Book book:Student.getBorrowedBooks()){
            System.out.println(book.getBookName());

        }

    }
    public void saveBooks(){
        FileUtil.saveObject("book.ser", books, StandardOpenOption.CREATE);
    }
    public void loadBooks(){
        Path path= Paths.get("book.ser");
        if (Files.exists(path)){
            books= (ArrayList<Book>) FileUtil.loadObject("book.ser");

        }else {
            books= new ArrayList<>();
            addBooks();
            saveBooks();
        }
    }

}
