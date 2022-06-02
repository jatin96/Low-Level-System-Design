package models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Rack {
    private List<BookCopy> bookcopies;

    public Rack() {
        this.bookcopies = new ArrayList<>();
    }
}
