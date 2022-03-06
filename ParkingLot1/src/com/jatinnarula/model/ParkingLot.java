package com.jatinnarula.model;

import com.jatinnarula.exceptions.InvalidSlotException;
import com.jatinnarula.exceptions.ParkingLotException;
import com.jatinnarula.exceptions.SlotOccupiedException;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private int MAX_CAPACITY = 100000;
    private int capacity;
    private Map<Integer, Slot> slots;

    public int getCapacity() { return capacity; }

    public ParkingLot(final int capacity) {
        if (capacity > MAX_CAPACITY || capacity <= 0) {
            throw new ParkingLotException("Invalid capacity given for parking lot");
        }

        this.capacity = capacity;
        this.slots = new HashMap<>();
    }

    public Map<Integer, Slot> getSlots() {
        return slots;
    }

    private Slot getSlot(final Integer slotNumber) {
        if (slotNumber > getCapacity() || slotNumber <= 0) {
            throw new InvalidSlotException();
        }
        final Map<Integer, Slot> allSlots = getSlots();
        if (!allSlots.containsKey(slotNumber)) {
            allSlots.put(slotNumber, new Slot(slotNumber));
        }

        return allSlots.get(slotNumber);
    }

    public Slot park(final Car car, final Integer slotNumber) {
        final Slot slot = getSlot(slotNumber);
        if (!slot.isSlotFree()) {
            throw new SlotOccupiedException();
        }

        slot.assignCar(car);
        return slot;
    }

    public Slot makeSlotFree(final Integer slotNumber) {
        final Slot slot = getSlot(slotNumber);
        slot.unassignCar();
        return slot;
    }
}
