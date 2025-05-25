package controllers;

import dtos.CreateParkingLotRequestDto;
import dtos.CreateParkingLotResponseDto;
import dtos.ResponseStatus;
import models.DisplayBoard;
import models.ParkingLot;
import services.ParkingLotService;
import validators.ParkingLotValidator;

import java.util.UUID;

public class ParkingLotController {
    private final ParkingLotService parkingLotService;

    public ParkingLotController(ParkingLotService parkingLotService) {
        this.parkingLotService = parkingLotService;
    }

    public CreateParkingLotResponseDto createParkingLot(CreateParkingLotRequestDto request) {
        int numberOfFloors = request.getNumberOfFloors();
        String address = request.getAddress();
        int numberOfEntryGates = request.getNumberOfEntryGates();
        int numberOfExitGates = request.getNumberOfExitGates();

        if (!ParkingLotValidator.validateFloors(numberOfFloors))  {
            return new CreateParkingLotResponseDto(null, ResponseStatus.FAILURE, "wrong number of floors");
        }

        if (address.isBlank()) {
            return new CreateParkingLotResponseDto(null, ResponseStatus.FAILURE, "address is empty");
        }

        ParkingLot parkingLot = parkingLotService.createParkingLot(numberOfFloors, address, numberOfEntryGates, numberOfExitGates);

        return new CreateParkingLotResponseDto(parkingLot, ResponseStatus.SUCCESS, "");
    }

    public DisplayBoard getDisplayBoard(UUID parkingLotId) {
        return parkingLotService.getDisplayBoard(parkingLotId);
    }
}
