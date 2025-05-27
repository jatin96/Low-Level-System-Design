package repositories;

import models.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ParkingLotRepositoryImpl implements ParkingLotRepository {
    Map<UUID, ParkingLot> parkingLotMap = new HashMap<>();
    @Override
    public ParkingLot insertParkingLot(ParkingLot parkingLot) {
        parkingLotMap.put(parkingLot.getId(), parkingLot);

        return parkingLot;
    }

    @Override
    public ParkingLot getParkingLot(UUID id) {
       return parkingLotMap.getOrDefault(id, null);
    }

    @Override
    public ParkingSpot updateParkingSpot(ParkingSpot updatedParkingSpot) {
        ParkingLot parkingLot = getParkingLot(updatedParkingSpot.getParkingLotId());

        int index = -1;
        for (ParkingFloor floor: parkingLot.getParkingFloors()) {
            for (ParkingSpot spot: floor.getParkingSpots()) {
                if (spot.getSpotNumber() == updatedParkingSpot.getSpotNumber()) {
                    spot = updatedParkingSpot;
                }
            }
        }

        return updatedParkingSpot;
    }
}
