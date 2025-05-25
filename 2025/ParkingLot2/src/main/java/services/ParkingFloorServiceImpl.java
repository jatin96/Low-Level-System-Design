package services;

import models.ParkingFloor;
import models.ParkingSpot;
import models.ParkingSpotType;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static constants.ParkingLotConstants.*;

public class ParkingFloorServiceImpl implements ParkingFloorService{

    private final ParkingSpotService parkingSpotService;

    public ParkingFloorServiceImpl(ParkingSpotService parkingSpotService) {
        this.parkingSpotService = parkingSpotService;
    }
    @Override
    public ParkingFloor createParkingFloor(int floorNumber, UUID parkingLotId) {
        List<ParkingSpot> spotList = new ArrayList<>();
        int spotNumber = 1;
        for (int i = 1; i <= TOTAL_SMALL_SPOTS; i++) {
            spotList.add(parkingSpotService.createParkingSpot(spotNumber++, floorNumber, parkingLotId, ParkingSpotType.SMALL));
        }

        for (int i = 1; i <= TOTAL_MEDIUM_SPOTS; i++) {
            spotList.add(parkingSpotService.createParkingSpot(spotNumber++, floorNumber, parkingLotId, ParkingSpotType.MEDIUM));
        }

        for (int i = 1; i <= TOTAL_LARGE_SPOTS; i++) {
            spotList.add(parkingSpotService.createParkingSpot(spotNumber++, floorNumber, parkingLotId, ParkingSpotType.LARGE));
        }

        for (int i = 1; i <= TOTAL_ELECTRIC_SPOTS; i++) {
            spotList.add(parkingSpotService.createParkingSpot(spotNumber++, floorNumber, parkingLotId, ParkingSpotType.ELECTRIC));
        }

        return new ParkingFloor(floorNumber, spotList);
    }
}
