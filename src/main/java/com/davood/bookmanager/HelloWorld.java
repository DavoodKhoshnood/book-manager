package com.davood.bookmanager;

public class HelloWorld {
    public static void main(String[] args) {
        BookManager manager = new BookManager();

        manager.addBook(new Book("The Hobbit", "J.R.R. Tolkien", 1937));
        manager.addBook(new Book("1984", "George Orwell", 1949));
        manager.addBook(new Book("Clean Code", "Robert C. Martin", 2008));

        manager.listBooks();
    }
}

