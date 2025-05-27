package strategies;

import models.*;
import repositories.ParkingSpotRepository;

import java.util.stream.Collectors;

public class BruteForceStrategyImpl implements ParkingSpotStrategy {

    @Override
    public ParkingSpot findParkingSpot(ParkingLot parkingLot, VehicleType vehicleType) {
        return parkingLot.getParkingFloors()
                .stream()
                .map(floor -> floor.getParkingSpots()
                        .stream()
                        .filter(spot -> findSpotType(vehicleType) == spot.getType() &&
                                spot.getStatus() == ParkingSpotStatus.EMPTY)
                        .toList().getFirst()).toList().getFirst();
    }

    private static ParkingSpotType findSpotType(VehicleType vehicleType) {
        if (vehicleType == VehicleType.SMALL) return ParkingSpotType.SMALL;
        if (vehicleType == VehicleType.MEDIUM) return ParkingSpotType.MEDIUM;
        if (vehicleType == VehicleType.LARGE) return ParkingSpotType.LARGE;

        return ParkingSpotType.ELECTRIC;
    }
}
