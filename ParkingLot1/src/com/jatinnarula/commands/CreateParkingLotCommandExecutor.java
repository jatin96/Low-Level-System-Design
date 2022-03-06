package com.jatinnarula.commands;

import com.jatinnarula.OutputPrinter;
import com.jatinnarula.model.Command;
import com.jatinnarula.model.ParkingLot;
import com.jatinnarula.model.parking.strategy.NaturalOrderingParkingStrategy;
import com.jatinnarula.service.ParkingLotService;
import com.jatinnarula.utilities.IntegerValidator;

import java.util.List;

public class CreateParkingLotCommandExecutor extends CommandExecutor {

    public static final String COMMAND_NAME = "create_parking_lot";

    public CreateParkingLotCommandExecutor(
            final ParkingLotService parkingLotService, final OutputPrinter outputPrinter) {
        super(parkingLotService, outputPrinter);
    }

    @Override
    public boolean validate(Command command) {
        final List<String> params = command.getParams();

        if (params.size() != 1)
            return false;

        return IntegerValidator.isInteger(params.get(0));
    }

    @Override
    public void execute(Command command) {
        final int parkingLotCapacity = Integer.parseInt(command.getParams().get(0));
        final ParkingLot parkingLot = new ParkingLot(parkingLotCapacity);
        parkingLotService.createParkingLot(parkingLot, new NaturalOrderingParkingStrategy());
        outputPrinter.printNewLine("Created parking lot with " + parkingLotCapacity + " slots");
    }
}
