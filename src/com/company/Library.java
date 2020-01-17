package com.company;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Library {

    ArrayList<Book> books= new ArrayList<>();

    Student student = new Student();
    Librarian librarian = new Librarian();

    Scanner input = new Scanner(System.in);

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
                    System.out.println("welcome student what would you like to do");
                    student.StudentLogin();
                    break;
                case "2":
                    System.out.println("welcome librarian what would you like to do");
                    librarian.LibrarianLogin();
                    break;
                case "3":
                    System.out.println("Thank you come again");
                    running = false;
                    break;

            }
        }


    }

    public void showAllBooks() {

       Book book1 = new Book("Crime and punishment", "Freydor Dostoyevski",
                "Crime and Punishment is a novel by the Russian author Fyodor Dostoevsky. " +
                        "It was first published in the literary journal The Russian Messenger in twelve monthly installments during 1866. " +
                        "It was later published in a single volume." +
                        " It is the second of Dostoevsky's full-length novels following his return from ten years of exile in Siberia. ", true);
        book1.setAvailability(false);
        book1.getBookAuthor();
        book1.getBookName();

        Book book2 = new Book("Thus speaks Zarathustra", "Frederich Nistzche", "Thus Spoke Zarathustra: A Book for All and None is a philosophical novel by German philosopher" +
                " Friedrich Nietzsche, " +
                "composed in four parts written between 1883 and 1885 and published between 1883 and 1891", false);
        book2.setAvailability(true);
        book2.getBookName();
        book2.getBookAuthor();

        Book book3 = new Book("The selfish Gene", "Richard Dawkinns", "The Selfish Gene is a 1976 book on evolution by the biologist Richard Dawkins, " +
                "in which the author builds upon the principal theory of George C. Williams's Adaptation and Natural Selection." +
                " Dawkins uses the term selfish gene as a way of expressing the gene-centred view of evolution, popularising ideas developed during the 1960s", true);
        book3.setAvailability(false);
        book3.getBookAuthor();
        book3.getBookName();

        Book book4 = new Book("The Kama sutra", "unknown", "The Kama Sutra is an ancient Indian Sanskrit text on sexuality, " +
                "eroticism and emotional fulfillment in life." +
                " Attributed to Vātsyāyana, the Kama Sutra is neither exclusively nor predominantly a sex manual on sex positions," +
                " but written as a guide to the art-of-living well, the nature of love, finding a life partner," +
                " maintaining one's love life, and other aspects pertaining to pleasure-oriented faculties of human life." +
                " Kamasutra is the oldest surviving Hindu text on erotic love", true);

        Book book5 = new Book("The Bible", "unknown", "The Bible is a compilation of 66 books and letters written by more than 40 authors during a period of approximately 1,500 years. " +
                "Its original text was communicated in just three languages: Hebrew, koine or common Greek, and Aramaic. " +
                "The Old Testament was written for the most part in Hebrew, with a small percentage in Aramaic. " +
                "The New Testament was written in Greek.", true);


    }


}
