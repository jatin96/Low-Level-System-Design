package com.jatinnarula.commands;

import com.jatinnarula.OutputPrinter;
import com.jatinnarula.model.Command;
import com.jatinnarula.service.ParkingLotService;
import com.jatinnarula.utilities.IntegerValidator;

import java.util.List;

public class LeaveCommandExecutor extends CommandExecutor {

    public static final String COMMAND_NAME = "leave";

    public LeaveCommandExecutor(ParkingLotService parkingLotService, OutputPrinter outputPrinter) {
        super(parkingLotService, outputPrinter);
    }

    @Override
    public boolean validate(Command command) {
        final List<String> params = command.getParams();
        if (params.size() != 1) {
            return false;
        }

        return IntegerValidator.isInteger(params.get(0));
    }

    @Override
    public void execute(Command command) {
        final int slotNumber = Integer.parseInt(command.getParams().get(0));
        parkingLotService.makeSlotFree(slotNumber);
        outputPrinter.printNewLine("Slot number" + slotNumber + " is free");
    }
}
