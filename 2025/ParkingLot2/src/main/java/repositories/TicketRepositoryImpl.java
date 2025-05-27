package repositories;

import models.ParkingSpot;
import models.Ticket;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TicketRepositoryImpl implements TicketRepository {
    Map<UUID, Ticket> ticketMap = new HashMap<>();
    @Override
    public Ticket createTicket(String vehicleNumber, ParkingSpot parkingSpot, UUID parkingLotId, String ownerName, Instant entryTime) {
        Ticket ticket = new Ticket(UUID.randomUUID(), entryTime, vehicleNumber, parkingSpot, parkingLotId, ownerName);
        ticketMap.put(ticket.getId(), ticket);

        return ticket;
    }
}
