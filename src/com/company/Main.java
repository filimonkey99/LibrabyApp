package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here



        Library library = new Library();
        library.ShowOptions();


        Book book1 = new Book("Crime and punishment", "Freydor Dostoyevski", "a world renown book about despair Russian author dostoyevsky ", true);
        book1.setAvailability(false);
        book1.getBookAuthor();
        book1.getBookName();

        Book book2 = new Book("Thus speaks Zarathustra", "Frederich Nistzche", "A philosofical work exploring morality ", false);
        book2.setAvailability(true);
        book2.getBookName();
        book2.getBookAuthor();

        Book book3 = new Book("The selfish Gene", "Richard Dawkinns", "a book exploring selfishness as a productive motivatior", true);
        book3.setAvailability(false);
        book3.getBookAuthor();
        book3.getBookName();




    }

}
