package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class Ticket {
    UUID id;
    private Instant time;
    private String vehicleNumber;
    private ParkingSpot parkingSpot;
    private UUID parkingLotId;
    private String ownerName;

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", time=" + time +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", parkingSpot=" + parkingSpot +
                ", parkingLotId=" + parkingLotId +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
