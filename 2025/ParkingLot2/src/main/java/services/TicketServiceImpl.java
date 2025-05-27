package services;

import lombok.AllArgsConstructor;
import models.ParkingLot;
import models.ParkingSpot;
import models.Ticket;
import models.Vehicle;
import repositories.ParkingLotRepository;
import repositories.TicketRepository;
import strategies.ParkingSpotStrategy;

import java.time.Instant;
import java.util.UUID;

@AllArgsConstructor
public class TicketServiceImpl implements TicketService {
    private ParkingSpotStrategy parkingSpotStrategy;
    private ParkingLotService parkingLotService;
    private TicketRepository ticketRepository;
    private ParkingLotRepository parkingLotRepository;
    @Override
    public Ticket createTicket(Vehicle vehicle, String vehicleOwner, Instant entryTime, UUID parkingLotId) {
        ParkingLot parkingLot = parkingLotRepository.getParkingLot(parkingLotId);
        ParkingSpot parkingSpot = parkingSpotStrategy.findParkingSpot(parkingLot, vehicle.getSize());
        parkingLotService.parkVehicle(parkingSpot, vehicle);

        return ticketRepository.createTicket(vehicle.getNumberPlate(), parkingSpot, parkingLotId, vehicleOwner, entryTime);
    }
}
