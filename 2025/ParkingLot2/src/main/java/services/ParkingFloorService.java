package services;

import models.ParkingFloor;

import java.util.UUID;

public interface ParkingFloorService {
    ParkingFloor createParkingFloor(int floorNumber, UUID parkingLotId);
}
