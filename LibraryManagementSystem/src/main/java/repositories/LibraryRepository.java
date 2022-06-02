package repositories;

import models.Library;
import models.Rack;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryRepository {
    Library library;

    public Library addLibrary(Library library) {
        this.library = library;
        return library;
    }

    public Library getLibrary() {
        return library;
    }

    public Rack[] getRacks() {
        return library.getRacks();
    }

    public Rack getRack(int rackNo) {
        return library.getRacks()[rackNo];
    }
}
