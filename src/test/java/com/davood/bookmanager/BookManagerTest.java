package com.davood.bookmanager;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookManagerTest {
    @Test
    void testAddAndFindBook() {
        BookManager manager = new BookManager();
        manager.addBook("Effective Java", "Joshua Bloch", 2008);

        Book found = manager.findBookByTitle("Effective Java");

        assertNotNull(found);
        assertEquals("Joshua Bloch", found.getAuthor());
    }

    @Test
    void testSearchByKeyword() {
        BookManager manager = new BookManager();
        manager.addBook("Refactoring", "Martin Fowler", 1999);
        manager.addBook("Clean Code", "Robert C. Martin", 2008);

        assertEquals(1, manager.searchBooksByKeyword("refactor").size());
        assertEquals(2, manager.searchBooksByKeyword("martin").size());
    }
}
