import factories.PlayerFactory;
import models.*;
import org.junit.Before;
import org.junit.Test;
import services.strategies.DefaultPlayingStrategy;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TicTacToeTest {

    private Game game;

    @Before
    public void setUp() {
        this.game = createGame();
    }

    private Game createGame() {
        // pass the dimensions because you should not give access to the entire board to the client
        // you should not allow the client to mutate this because it can throw error since someone can pass empty object here
        // here what you need is immutable + validation : this signals builder pattern
        // client should not be aware of the child subclasses
        Game game = Game.getBuilder()
                .withDimensions(3, 3)
                .withPlayer(PlayerFactory.getHumanPlayer().user(new User()).symbol(GameSymbol.CIRCLE).build())
                .withPlayer(PlayerFactory.getBotPlayer().playingStrategy(new DefaultPlayingStrategy()).symbol(GameSymbol.CROSS).build())
                .build();

        return game;
    }

    @Test
    public void testDimensions() {
        List<List<Cell>> cells = game.getBoard().getCells();
        assertEquals(3, cells.size());
        assertEquals(3, cells.get(0).size());
    }

}
