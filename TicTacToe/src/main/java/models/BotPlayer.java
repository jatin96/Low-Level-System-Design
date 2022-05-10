package models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import services.strategies.PlayingStrategy;

@Getter
@Setter
@SuperBuilder(toBuilder = true)
public class BotPlayer extends Player {

    private PlayingStrategy playingStrategy;
    @Override
    public Cell move(Board board) {
        return null;
    }
}
