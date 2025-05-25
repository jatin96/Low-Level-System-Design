package dtos;

import lombok.Getter;
import lombok.Setter;
import models.Vehicle;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
public class CreateTicketRequestDto {
    private Vehicle vehicle;
    private String vehicleOwner;
    private Instant entryTime;
    private UUID parkingLotId;
}
