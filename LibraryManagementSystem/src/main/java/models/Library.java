package models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Library {
    private int libraryId;
    private int noOfRacks;
    private Rack[] racks;

    public Library(int libraryId, int noOfRacks) {
        this.libraryId = libraryId;
        this.noOfRacks = noOfRacks;
        racks = new Rack[noOfRacks];
        for (int i = 0; i < noOfRacks; i++) racks[i] = new Rack();
    }

    @Override
    public String toString() {
        return (libraryId + ": racks" + noOfRacks);
    }
}
