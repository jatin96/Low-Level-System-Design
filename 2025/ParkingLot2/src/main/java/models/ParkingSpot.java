package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class ParkingSpot {
    private int spotNumber;
    private int floorNumber;
    private UUID ParkingLotId;
    private ParkingSpotType type;
    private String vehicleNumber;
    private ParkingSpotStatus status;

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "spotNumber=" + spotNumber +
                ", floorNumber=" + floorNumber +
                ", ParkingLotId=" + ParkingLotId +
                ", type=" + type +
                ", status=" + status +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                '}';
    }
}
