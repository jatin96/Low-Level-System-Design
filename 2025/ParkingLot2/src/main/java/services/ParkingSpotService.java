package services;

import models.ParkingSpot;
import models.ParkingSpotType;

import java.util.UUID;

public interface ParkingSpotService {
    ParkingSpot createParkingSpot(int spotNumber, int floorNumber, UUID parkingLotId, ParkingSpotType type);
}
