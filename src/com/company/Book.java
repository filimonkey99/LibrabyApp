package com.company;

public class Book {
private String bookName;
private String bookAuthor;
private boolean availability;

    public Book(String bookName, String bookAuthor, boolean availability) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.availability = availability;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
