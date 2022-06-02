package repositories;

import models.Book;

import java.util.HashMap;
import java.util.Map;

public class BookRepository {
    Map<Integer, Book> bookMap = new HashMap<>();

    public Book addBook(Book book) {
        bookMap.put(book.getBookId(), book);
        return bookMap.get(book.getBookId());
    }
}
