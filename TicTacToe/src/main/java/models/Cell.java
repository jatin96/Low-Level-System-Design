package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cell {
    private Integer x;
    private Integer y;
    private GameSymbol symbol;

    public Cell(Integer x, Integer y, GameSymbol symbol) {
        this.x = x;
        this.y = y;
        this.symbol = symbol;
    }
}
