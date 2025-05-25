package repositories;

import models.ParkingLot;
import models.ParkingSpot;

import java.util.UUID;

public interface ParkingLotRepository {
    ParkingLot insertParkingLot(ParkingLot parkingLot);

    ParkingLot getParkingLot(UUID id);

    ParkingSpot updateParkingSpot(ParkingSpot updatedParkingSpot);
}
