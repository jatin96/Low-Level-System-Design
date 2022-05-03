package models.pens;

import models.Color;
import models.refills.Refill;
import services.strategies.refillWriteStrategy.factory.RefillPenWriteStrategyFactory;

public class RefillPen implements Pen {

    private Refill refill;

    public RefillPen(Refill refill) {
        this.refill = refill;
    }

    @Override
    public void write() {
        RefillPenWriteStrategyFactory
                .getStrategyForType(refill.getRefillType())
                .write();
    }

    @Override
    public Color getColor() {
        return null;
    }
}
