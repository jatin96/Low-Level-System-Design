package services;

import models.BookCopy;
import models.Library;
import models.Rack;
import repositories.LibraryRepository;

import java.util.List;

public class LibraryService {
    private LibraryRepository libraryRepository;

    public LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    public Library createLibrary(int id, int noOfRacks) {
        // create library here.
        Library library = new Library(id, noOfRacks);
        return libraryRepository.addLibrary(library);
    }

    public Rack[] getRacks() {
        return libraryRepository.getRacks();
    }

    public boolean isBookPresentInRack(int bookId, Rack rack) {
        List<BookCopy> bookCopies = rack.getBookcopies();

        for (BookCopy bookCopy : bookCopies) {
            if (bookCopy.getBookId() == bookId)
                return true;
        }

        return false;
    }

    public Rack addBookCopyInRack(BookCopy bookCopy, int rackNo) {
        Rack rack = libraryRepository.getRack(rackNo);
        rack.getBookcopies().add(bookCopy);
        return rack;
    }
}
