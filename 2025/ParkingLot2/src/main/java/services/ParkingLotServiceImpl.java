package services;

import lombok.AllArgsConstructor;
import models.*;
import repositories.ParkingLotRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
public class ParkingLotServiceImpl implements  ParkingLotService {

    ParkingFloorService parkingFloorService;
    GateService gateService;

    ParkingLotRepository parkingLotRepository;

    @Override
    public ParkingLot createParkingLot(int numberOfFloors, String address, int numberOfEntryGates, int numberOfExitGates) {
        List<ParkingFloor> floorList = new ArrayList<>();
        UUID parkingLotId = UUID.randomUUID();
        for (int floorNumber = 1; floorNumber <= numberOfFloors; floorNumber++) {
            floorList.add(parkingFloorService.createParkingFloor(floorNumber, parkingLotId));
        }

        List<EntryGate> entryGateList = new ArrayList<>();
        for (int entryGateNumber = 1; entryGateNumber <= numberOfEntryGates; ++entryGateNumber) {
            entryGateList.add(gateService.createEntryGate(entryGateNumber));
        }

        List<ExitGate> exitGateList = new ArrayList<>();
        for (int exitGateNumber = 1; exitGateNumber <= numberOfExitGates; exitGateNumber++) {
            exitGateList.add(gateService.createExitGate(exitGateNumber));
        }

        ParkingLot parkingLot = new ParkingLot(parkingLotId, address, floorList, entryGateList, exitGateList);
        parkingLotRepository.insertParkingLot(parkingLot);

        return parkingLot;
    }

    @Override
    public DisplayBoard getDisplayBoard(UUID parkingLotId) {
        int largeSpots = 0;
        int mediumSpots = 0;
        int smallSpots = 0;
        int electricSpots = 0;
        ParkingLot parkingLot = parkingLotRepository.getParkingLot(parkingLotId);
        for (ParkingFloor floor: parkingLot.getParkingFloors()) {
            for (ParkingSpot spot: floor.getParkingSpots()) {
                if (spot.getStatus() == ParkingSpotStatus.OCCUPIED) continue;
                if (spot.getType() == ParkingSpotType.SMALL) smallSpots++;
                if (spot.getType() == ParkingSpotType.MEDIUM) mediumSpots++;
                if (spot.getType() == ParkingSpotType.LARGE) largeSpots++;
                if (spot.getType() == ParkingSpotType.ELECTRIC) electricSpots++;
            }
        }

        return new DisplayBoard(largeSpots, mediumSpots, smallSpots, electricSpots);
    }

    @Override
    public void parkVehicle(ParkingSpot parkingSpot, Vehicle vehicle) {
        parkingSpot.setVehicleNumber(vehicle.getNumberPlate());
        parkingSpot.setStatus(ParkingSpotStatus.OCCUPIED);

        parkingLotRepository.updateParkingSpot(parkingSpot);
    }
}
