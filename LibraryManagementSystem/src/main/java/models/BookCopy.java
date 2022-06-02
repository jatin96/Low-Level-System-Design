package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookCopy {
    private int bookCopyId;
    private int bookId;

    public BookCopy(int bookCopyId, int bookId) {
        this.bookCopyId = bookCopyId;
        this.bookId = bookId;
    }
}
