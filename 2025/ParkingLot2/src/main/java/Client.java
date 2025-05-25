import controllers.ParkingLotController;
import controllers.TicketController;
import dtos.CreateParkingLotRequestDto;
import dtos.CreateTicketRequestDto;
import models.*;
import repositories.*;
import services.*;
import strategies.BruteForceStrategyImpl;
import strategies.ParkingSpotStrategy;

import java.time.Instant;

public class Client {
    public static void main(String[] args) {

        // strategies
        ParkingSpotStrategy strategy = new BruteForceStrategyImpl();

        // repositories
        ParkingLotRepository parkingLotRepository = new ParkingLotRepositoryImpl();
        ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepositoryImpl();
        TicketRepository ticketRepository = new TicketRepositoryImpl();

        // services
        GateService gateService = new GateServiceImpl();
        ParkingSpotService parkingSpotService = new ParkingSpotServiceImpl(parkingSpotRepository);
        ParkingFloorService parkingFloorService = new ParkingFloorServiceImpl(parkingSpotService);
        ParkingLotService parkingLotService = new ParkingLotServiceImpl(parkingFloorService, gateService, parkingLotRepository);
        TicketService ticketService = new TicketServiceImpl(strategy, parkingLotService, ticketRepository, parkingLotRepository);

        // controllers
        ParkingLotController parkingLotController = new ParkingLotController(parkingLotService);
        TicketController ticketController = new TicketController(ticketService);

        // execution
        CreateParkingLotRequestDto createParkingLotRequestDto = new CreateParkingLotRequestDto();
        createParkingLotRequestDto.setAddress("shastri nagar");
        createParkingLotRequestDto.setNumberOfExitGates(2);
        createParkingLotRequestDto.setNumberOfEntryGates(4);
        createParkingLotRequestDto.setNumberOfFloors(4);


        ParkingLot parkingLot = parkingLotController.createParkingLot(createParkingLotRequestDto).getParkingLot();
        System.out.println(parkingLot);

        DisplayBoard displayBoard = parkingLotController.getDisplayBoard(parkingLot.getId());
        System.out.println(displayBoard);

        CreateTicketRequestDto ticketRequestDto = new CreateTicketRequestDto();
        ticketRequestDto.setEntryTime(Instant.now());
        ticketRequestDto.setVehicle(new Vehicle("Suzuki", "Swift", "UP78JL7505", VehicleType.SMALL));
        ticketRequestDto.setParkingLotId(parkingLot.getId());
        ticketRequestDto.setVehicleOwner("Jatin Narula");
        Ticket ticket = ticketController.createTicket(ticketRequestDto).getTicket();
        System.out.println(ticket);

        System.out.println(parkingLotController.getDisplayBoard(parkingLot.getId()));

        ticketRequestDto.setVehicleOwner("Tanya Mehrotra");
        ticketRequestDto.setVehicle(new Vehicle("Range Rover", "XYZ", "UP70JK5678", VehicleType.LARGE));
        ticketRequestDto.setEntryTime(Instant.now());
        ticketRequestDto.setParkingLotId(parkingLot.getId());
        Ticket ticket1 = ticketController.createTicket(ticketRequestDto).getTicket();


        System.out.println(ticket1);
        System.out.println(parkingLotController.getDisplayBoard(parkingLot.getId()));

    }
}
