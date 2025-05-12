package com.davood.bookmanager;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<Book> books;

    public BookManager() {
        books = new ArrayList<>();
    }

    public void addBook(String title, String author, int year) {
        Book book = new Book(title, author, year);
        books.add(book);
    }

    public void listBooks() {
        int index = 1;
        for (Book book : books) {
            System.out.println(index + ". " + book);
            index++;
        }
    }

    // Find a book by title
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // not found!
    }
}

