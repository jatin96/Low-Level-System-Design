package com.jatinnarula.commands;

import com.jatinnarula.OutputPrinter;
import com.jatinnarula.exceptions.NoFreeSlotAvailableException;
import com.jatinnarula.model.Car;
import com.jatinnarula.model.Command;
import com.jatinnarula.service.ParkingLotService;

public class ParkCommandExecutor extends CommandExecutor {

    public static final String COMMAND_NAME = "park";

    public ParkCommandExecutor(
            final ParkingLotService parkingLotService, final OutputPrinter outputPrinter) {
        super(parkingLotService, outputPrinter);
    }

    @Override
    public boolean validate(Command command) {
        return command.getParams().size() == 2;
    }

    @Override
    public void execute(Command command) {
        final Car car = new Car(command.getParams().get(0), command.getParams().get(1));

        try {
                final Integer slot = parkingLotService.park(car);
                outputPrinter.printNewLine("Allocated slot number : " + slot);
        } catch (NoFreeSlotAvailableException exception) {
            outputPrinter.printNewLine("Parking Lot is full");
        }
    }
}
