package controllers;

import models.Library;
import services.LibraryService;

public class LibraryController {
    private LibraryService libraryService;

    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    public Library createLibrary(int id, int noOfRacks) {
        return libraryService.createLibrary(id, noOfRacks);
    }
}
