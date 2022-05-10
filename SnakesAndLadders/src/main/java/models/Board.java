package models;

import lombok.Getter;
import lombok.Setter;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Board {
    private int size;
    private List<Cell> cells = new ArrayList<>();
    private List<Snake> snakes = new ArrayList<>();
    private List<Ladder> ladders = new ArrayList<>();
}
