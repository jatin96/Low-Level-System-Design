package strategies;

import models.ParkingLot;
import models.ParkingSpot;
import models.Vehicle;
import models.VehicleType;

import java.util.UUID;

public interface ParkingSpotStrategy {
    public ParkingSpot findParkingSpot(ParkingLot parkingLot, VehicleType vehicleType);
}
