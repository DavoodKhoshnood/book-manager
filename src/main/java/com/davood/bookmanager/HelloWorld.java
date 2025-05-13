package com.davood.bookmanager;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        BookManager manager = new BookManager();

        manager.addBook("The Hobbit", "J.R.R. Tolkien", 1937);
        manager.addBook("1984", "George Orwell", 1949);
        manager.addBook("Clean Code", "Robert C. Martin", 2008);

        manager.listBooks();

        // Search for a book
        Book found = manager.findBookByTitle("1984");
        System.out.println();

        if(found != null) {
            System.out.println("Search results for title '1984':");
            System.out.println("Found: " + found);
        } else {
            System.out.println("Book not found!");
        }

        System.out.println();

        // Search keyword
        System.out.println("Search results for keyword 'clean':");
        List<Book> searchResults = manager.searchBooksByKeyword("clean");
        for (Book book : searchResults) {
            System.out.println(book);
        }
    }
}

