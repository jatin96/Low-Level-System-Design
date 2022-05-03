package models.refills;

import models.Nib;

public abstract class Refill {

    private Nib nib;
    private RefillType refillType;

    public Refill(RefillType refillType) {
        this.refillType = refillType;
    }

    public Nib getNib() {
        return nib;
    }

    public void setNib(Nib nib) {
        this.nib = nib;
    }

    public RefillType getRefillType() {
        return refillType;
    }

    public void setRefillType(RefillType refillType) {
        this.refillType = refillType;
    }

    public abstract void write();
}
