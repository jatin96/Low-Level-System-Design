package com.jatinnarula.commands;

import com.jatinnarula.OutputPrinter;
import com.jatinnarula.model.Command;
import com.jatinnarula.model.parking.strategy.ParkingStrategy;
import com.jatinnarula.service.ParkingLotService;

public abstract class CommandExecutor {
    protected ParkingLotService parkingLotService;
    protected OutputPrinter outputPrinter;

    public CommandExecutor(final ParkingLotService parkingLotService,
                           final OutputPrinter outputPrinter) {
        this.parkingLotService = parkingLotService;
        this.outputPrinter = outputPrinter;
    }

    public abstract boolean validate(Command command);

    public abstract void execute(Command command);
}
