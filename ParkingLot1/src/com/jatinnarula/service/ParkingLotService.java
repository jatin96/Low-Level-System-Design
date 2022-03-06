package com.jatinnarula.service;

import com.jatinnarula.exceptions.ParkingLotException;
import com.jatinnarula.model.Car;
import com.jatinnarula.model.ParkingLot;
import com.jatinnarula.model.Slot;
import com.jatinnarula.model.parking.strategy.ParkingStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ParkingLotService {
    private ParkingLot parkingLot;
    private ParkingStrategy parkingStrategy;

    public void createParkingLot(final ParkingLot parkingLot, final ParkingStrategy parkingStrategy) {
        if (this.parkingLot != null) {
            throw new ParkingLotException("parking lot already exists");
        }

        this.parkingLot = parkingLot;
        this.parkingStrategy = parkingStrategy;

        for (int i = 1; i <= parkingLot.getCapacity(); i++) {
            parkingStrategy.addSlot(i);
        }
    }

    public Integer park(final Car car) {
        if (parkingLot == null) {
            throw new ParkingLotException("Parking lot doesn't exists to park");
        }

        final Integer nextFreeSlot = parkingStrategy.getNextSlot();
        parkingLot.park(car, nextFreeSlot);
        parkingStrategy.removeSlot(nextFreeSlot);
        return nextFreeSlot;
    }

    public void makeSlotFree(final Integer slotNumber) {
        if (parkingLot == null) {
            throw new ParkingLotException("Parking lot doesn't exists to park");
        }

        parkingLot.makeSlotFree(slotNumber);
        parkingStrategy.addSlot(slotNumber);
    }

    public List<Slot> getOccupiedSlots() {
        if (parkingLot == null) {
            throw new ParkingLotException("Parking lot doesn't exists to park");
        }

        final List<Slot> occupiedSlotList = new ArrayList<>();
        final Map<Integer, Slot> allSlots = parkingLot.getSlots();

        for (int i = 1; i <= parkingLot.getCapacity(); i++) {
            if(allSlots.containsKey(i)) {
                final Slot slot = allSlots.get(i);
                if(!slot.isSlotFree())
                    occupiedSlotList.add(slot);
            }
        }

        return occupiedSlotList;
    }

    public List<Slot> getSlotsForColor(final String color) {
        final List<Slot> occupiedSlots = getOccupiedSlots();
        return occupiedSlots.stream().
                filter(slot -> slot.getParkedCar().getColor().equals(color)).
                collect(Collectors.toList());
    }
}
