package commands;

import models.Command;
import service.CabBookingService;
import utilities.OutputPrinter;

public abstract class CommandExecutor {
    protected CabBookingService cabBookingService;
    protected OutputPrinter outputPrinter;

    public CommandExecutor(final CabBookingService cabBookingService,
                           final OutputPrinter outputPrinter) {
        this.cabBookingService = cabBookingService;
        this.outputPrinter = outputPrinter;
    }

    public abstract boolean validate(Command command);
    public abstract void execute(Command command);


}
