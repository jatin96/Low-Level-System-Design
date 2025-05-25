package services;

import models.DisplayBoard;
import models.ParkingLot;
import models.ParkingSpot;
import models.Vehicle;

import java.util.UUID;

public interface ParkingLotService {
   ParkingLot createParkingLot(int numberOfFloors, String address, int numberOfEntryGates, int numberOfExitGates);
   DisplayBoard getDisplayBoard(UUID parkingLotId);
   void parkVehicle(ParkingSpot parkingSpot, Vehicle vehicle);
}
