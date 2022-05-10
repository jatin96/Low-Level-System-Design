package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Snake extends Cell {

    private int startIndex;
    private int endIndex;

    public Snake(int startIndex, int endIndex) {
        super(CellType.SNAKE);
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public int nextLocation() {
        return endIndex;
    }
}
