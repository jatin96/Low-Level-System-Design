package commands;

import models.Cab;
import models.Command;
import service.CabBookingService;
import utilities.OutputPrinter;

public class EndTripCommandExecutor extends CommandExecutor {
    public final static String COMMAND_NAME = "end_trip";

    public EndTripCommandExecutor(final CabBookingService cabBookingService,
                                      final OutputPrinter outputPrinter) {
        super(cabBookingService, outputPrinter);
    }
    @Override
    public boolean validate(Command command) {
        if (command.getParams().size() != 1)
            return false;

        return true;
    }

    @Override
    public void execute(Command command) {
        String cabId = command.getParams().get(0);

        cabBookingService.endTrip(cabId);
        outputPrinter.printNewLine("trip ended: " + cabId);
    }
}
