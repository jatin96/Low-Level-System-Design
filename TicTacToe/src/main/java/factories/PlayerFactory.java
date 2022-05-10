package factories;

import models.BotPlayer;
import models.HumanPlayer;
import models.Player;

public class PlayerFactory {
    public static HumanPlayer.HumanPlayerBuilder getHumanPlayer() {
        return HumanPlayer.builder();
    }

    public static BotPlayer.BotPlayerBuilder getBotPlayer() {
        return BotPlayer.builder();
    }

}
