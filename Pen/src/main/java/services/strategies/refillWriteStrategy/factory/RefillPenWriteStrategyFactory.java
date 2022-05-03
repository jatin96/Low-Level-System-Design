package services.strategies.refillWriteStrategy.factory;

import models.refills.RefillType;
import services.strategies.refillWriteStrategy.BallPenRefillWriteStrategy;
import services.strategies.refillWriteStrategy.GelPenRefillWriteStrategy;
import services.strategies.refillWriteStrategy.RefillWriteStrategy;

public class RefillPenWriteStrategyFactory {
    public static RefillWriteStrategy getStrategyForType(RefillType type) {
        if (type.equals(RefillType.BALL))
            return new BallPenRefillWriteStrategy();
        else
            return new GelPenRefillWriteStrategy();
    }
}
