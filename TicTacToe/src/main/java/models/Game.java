package models;

import lombok.Getter;
import lombok.Setter;
import services.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Game {
    private Board board;
    // always initialize your collections
    private List<Player> players = new ArrayList<>();
    private WinningStrategy winningStrategy;

    public static Builder getBuilder() {
        return new Builder();
    }


    public static class Builder {
        private Game game;
        Builder() {
            this.game = new Game();
        }

        private boolean validate() {
            if (game.getPlayers().size() == 2) {
                return true;
            }

            return false;
        }

        public Builder withDimensions(int rows, int columns) {
            Board board = new Board(rows, columns);
            this.game.setBoard(board);
            return this;
        }

        public Builder withPlayer(Player player) {
            this.game.getPlayers().add(player);
            return this;
        }

        public Game build() {

            if (!validate()) {
                throw new RuntimeException("Game is not valid");
            }
            return this.game;
        }
    }
}
