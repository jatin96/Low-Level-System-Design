package services;

import lombok.AllArgsConstructor;
import models.ParkingSpot;
import models.ParkingSpotStatus;
import models.ParkingSpotType;
import repositories.ParkingSpotRepository;

import java.util.UUID;

@AllArgsConstructor
public class ParkingSpotServiceImpl implements ParkingSpotService {
    private ParkingSpotRepository parkingSpotRepository;
    @Override
    public ParkingSpot createParkingSpot(int spotNumber, int floorNumber, UUID parkingLotId, ParkingSpotType type) {
        return parkingSpotRepository.createParkingSpot(spotNumber, floorNumber, parkingLotId, type);
    }
}
