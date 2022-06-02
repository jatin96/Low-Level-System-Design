package models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Book {
    private int bookId;
    private String title;
    private List<String> authors;
    private List<String> publishers;
    private List<Integer> bookCopyIds;

    public Book(int bookId, String title, List<String> authors, List<String> publishers, List<Integer> bookCopyIds) {
        this.bookId = bookId;
        this.title = title;
        this.authors = authors;
        this.publishers = publishers;
        this.bookCopyIds = bookCopyIds;
    }
}
