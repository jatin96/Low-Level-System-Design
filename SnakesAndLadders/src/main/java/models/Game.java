package models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Game {
    private Board board;
    private List<Player> players = new ArrayList<>();
    private List<Dice> dices = new ArrayList<>();
}
