package com.jatinnarula.model.parking.strategy;

import com.jatinnarula.exceptions.NoFreeSlotAvailableException;
import com.jatinnarula.model.Slot;

import java.util.TreeSet;

public class NaturalOrderingParkingStrategy implements ParkingStrategy {
    TreeSet<Integer> freeSlots;

    public NaturalOrderingParkingStrategy() {
        this.freeSlots = new TreeSet<>();
    }
    @Override
    public void addSlot(Integer slotNumber) {
        this.freeSlots.add(slotNumber);
    }

    @Override
    public void removeSlot(Integer slotNumber) {
        this.freeSlots.remove(slotNumber);
    }

    @Override
    public Integer getNextSlot() {
        if (freeSlots.isEmpty()) {
            throw new NoFreeSlotAvailableException();
        }

        return freeSlots.first();
    }
}
