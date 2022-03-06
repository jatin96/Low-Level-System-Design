package commands;

import models.Cab;
import models.Command;
import service.CabBookingService;
import utilities.OutputPrinter;

public class UpdateDriverAvailabilityCommandExecutor extends CommandExecutor {

    public final static String COMMAND_NAME = "update_driver_availability";

    public UpdateDriverAvailabilityCommandExecutor(
            final CabBookingService cabBookingService,
            final OutputPrinter outputPrinter
            ) {
        super(cabBookingService, outputPrinter);
    }

    @Override
    public boolean validate(Command command) {
        if (command.getParams().size() != 2) {
            return false;
        }

        return true;
    }

    @Override
    public void execute(Command command) {
        final String cabId = command.getParams().get(0);
        final boolean isAvailable = Boolean.parseBoolean(command.getParams().get(1));
        cabBookingService.setDriverAvailability(cabId, isAvailable);
        outputPrinter.printNewLine("Cab : " + cabId + " , Availability : " + isAvailable);
    }
}
