package controllers;

import models.Book;
import services.BookService;

import java.util.List;

public class BookController {
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    public List<Integer> addBook(int bookId, String title, List<String> authors, List<String> publishers, List<Integer> bookCopyId) {
        return bookService.addBook(bookId, title, authors, publishers, bookCopyId);
    }
}
