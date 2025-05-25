package repositories;

import lombok.AllArgsConstructor;
import models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
public class ParkingSpotRepositoryImpl implements ParkingSpotRepository {
    @Override
    public ParkingSpot createParkingSpot(int spotNumber, int floorNumber, UUID parkingLotId, ParkingSpotType type) {
        return new ParkingSpot(spotNumber, floorNumber, parkingLotId, type, "", ParkingSpotStatus.EMPTY);
    }
}
