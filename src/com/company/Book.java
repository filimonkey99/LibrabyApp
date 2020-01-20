package com.company;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String bookName;
    private String bookAuthor;
    private String description;
    private boolean availability;

    public Book(String bookName, String bookAuthor, String description ,boolean availability) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.description =description;
        this.availability = availability;
    }

    public Book() {

    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }
    public String getDescription(){
        return description;
    }

    public boolean getAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", availability=" + availability +
                '}';
    }


}
