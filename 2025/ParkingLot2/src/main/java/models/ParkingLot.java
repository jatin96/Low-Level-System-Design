package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class ParkingLot {
    private UUID id;
    private String location;
    private List<ParkingFloor> parkingFloors;
    private List<EntryGate> entryGates;
    private List<ExitGate> exitGates;

    @Override
    public String toString() {
        return "ParkingLot{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", parkingFloors=" + parkingFloors +
                ", entryGates=" + entryGates +
                ", exitGates=" + exitGates +
                '}';
    }
}
