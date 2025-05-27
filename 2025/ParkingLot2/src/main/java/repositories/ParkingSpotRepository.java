package repositories;

import models.ParkingSpot;
import models.ParkingSpotType;

import java.util.UUID;

public interface ParkingSpotRepository {
    ParkingSpot createParkingSpot(int spotNumber, int floorNumber, UUID parkingLotId, ParkingSpotType type);
}
