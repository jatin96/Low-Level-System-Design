package models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Board {

    // always initialize your collections
    List<List<Cell>> cells = new ArrayList<>();

    public Board(int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            List<Cell> row = new ArrayList<>();
            for (int j = 0; j < columns; j++)
                row.add(new Cell(i,j, GameSymbol.EMPTY));

            this.cells.add(row);
        }

    }
}
