package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder(toBuilder = true)
public class HumanPlayer extends Player {

    private User user;

    @Override
    public Cell move(Board board) {
        return null;
    }
}
