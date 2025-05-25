package repositories;

import models.ParkingLot;
import models.ParkingSpot;
import models.Ticket;

import java.time.Instant;
import java.util.UUID;

public interface TicketRepository {
    public Ticket createTicket(String vehicleNumber, ParkingSpot parkingSpot, UUID parkingLotId, String ownerName, Instant entryTime);
}
