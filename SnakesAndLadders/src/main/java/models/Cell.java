package models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public abstract class Cell {
    private int index;
    private CellType cellType;
    private List<Piece> pieces = new ArrayList<>();

    public Cell(CellType cellType) {
        this.cellType = cellType;
    }

    public abstract int nextLocation();
}
