package services.strategies;

import models.Board;
import models.Cell;

public interface PlayingStrategy {
    public Cell play(Board board);
}
