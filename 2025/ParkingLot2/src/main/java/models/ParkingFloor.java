package models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class ParkingFloor {
    private int floorNumber;
    private List<ParkingSpot> parkingSpots;

    @Override
    public String toString() {
        return "ParkingFloor{" +
                "floorNumber=" + floorNumber +
                ", parkingSpots=" + parkingSpots +
                '}';
    }
}
