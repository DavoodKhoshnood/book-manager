package com.davood.bookmanager;

public class Book {
    private String title;
    private String author;
    private int year;

    // Constructor
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Constructor without year
    public Book(String title, String author) {
        this(title, author, -1); // -1 = unknown year
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    // toString method
    @Override
    public String toString() {
        return title + " by " + author + (year >=0 ? " (" + year + ")" : "(Year unknown)");
    }
}

