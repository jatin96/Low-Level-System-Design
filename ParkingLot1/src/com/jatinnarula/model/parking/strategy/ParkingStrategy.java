package com.jatinnarula.model.parking.strategy;

import com.jatinnarula.model.Slot;

public interface ParkingStrategy {
    public void addSlot(Integer slotNumber);
    public void removeSlot(Integer slotNumber);
    public Integer getNextSlot();
}
