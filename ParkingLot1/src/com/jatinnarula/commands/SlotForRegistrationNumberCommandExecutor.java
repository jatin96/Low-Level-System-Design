package com.jatinnarula.commands;

import com.jatinnarula.OutputPrinter;
import com.jatinnarula.model.Command;
import com.jatinnarula.model.Slot;
import com.jatinnarula.service.ParkingLotService;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SlotForRegistrationNumberCommandExecutor extends CommandExecutor {
    public static final String COMMAND_NAME = "slot_number_for_registration_number";

    public SlotForRegistrationNumberCommandExecutor(
            final ParkingLotService parkingLotService, final OutputPrinter outputPrinter) {
        super(parkingLotService, outputPrinter);
    }

    @Override
    public boolean validate(Command command) {
        return command.getParams().size() == 1;
    }

    @Override
    public void execute(Command command) {
        final List<Slot> occupiedSlots = parkingLotService.getOccupiedSlots();
        final String regNumberToFind = command.getParams().get(0);
        Slot foundSlot = null;

        for (Slot occupiedSlot : occupiedSlots) {
            if (occupiedSlot.getParkedCar().getRegistrationNumber().equals(regNumberToFind)) {
                foundSlot = occupiedSlot;
                break;
            }
        }

        if (foundSlot != null) {
            outputPrinter.printNewLine(foundSlot.getSlotNumber().toString());
        } else {
            outputPrinter.printNewLine("Not Found");
        }
    }


}
