package services;

import models.Ticket;
import models.Vehicle;

import java.time.Instant;
import java.util.UUID;

public interface TicketService {
    Ticket createTicket(Vehicle vehicle, String vehicleOwner, Instant entryTime, UUID parkingLotId);
}
