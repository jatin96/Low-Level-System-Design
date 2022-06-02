package services;

import models.Book;
import models.BookCopy;
import models.Library;
import models.Rack;
import repositories.BookRepository;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    private BookRepository bookRepository;
    private LibraryService libraryService;

    // TODO: confirm whether you can take a service inside a service or take a repo also.
    public BookService(BookRepository bookRepository, LibraryService libraryService) {
        this.bookRepository = bookRepository;
        this.libraryService = libraryService;
    }

    public List<Integer> addBook(int bookId, String title, List<String> authors, List<String> publishers, List<Integer> bookCopyIds) {

        Book book = new Book(bookId, title, authors, publishers, bookCopyIds);
        Book persistedBook = bookRepository.addBook(book);
        Rack[] racks = libraryService.getRacks();

        int validRacks = 0;
        for (int rackNo = 0; rackNo < racks.length; rackNo++) {
            if (!libraryService.isBookPresentInRack(bookId, racks[rackNo]))
                validRacks++;
        }

        if (validRacks < bookCopyIds.size()) {
            throw new RuntimeException("Rack not available for some books");
        }

        List<Integer> racksFilled = new ArrayList<>();
        for (Integer bookCopyId : bookCopyIds) {
            for (int rackNo = 0; rackNo < racks.length; rackNo++) {
                if (!libraryService.isBookPresentInRack(bookId, racks[rackNo])) {
                    libraryService.addBookCopyInRack(new BookCopy(bookCopyId, bookId), rackNo);
                    racksFilled.add(rackNo);
                    break;
                }
            }
        }

        return racksFilled;
    }
}
