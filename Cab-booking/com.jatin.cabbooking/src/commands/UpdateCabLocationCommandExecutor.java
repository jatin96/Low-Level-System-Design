package commands;

import models.Command;
import models.Location;
import service.CabBookingService;
import utilities.OutputPrinter;

public class UpdateCabLocationCommandExecutor extends CommandExecutor {

    public final static String COMMAND_NAME = "update_cab_location";

    public UpdateCabLocationCommandExecutor(final CabBookingService cabBookingService,
                                            final OutputPrinter outputPrinter) {
        super(cabBookingService, outputPrinter);
    }

    @Override
    public boolean validate(Command command) {
        if (command.getParams().size() != 3)
            return false;

        return true;
    }

    @Override
    public void execute(Command command) {
        String cabId = command.getParams().get(0);
        Double locationX = Double.parseDouble(command.getParams().get(1));
        Double locationY = Double.parseDouble(command.getParams().get(2));
        cabBookingService.updateCabLocation(cabId, new Location(locationX, locationY));
        outputPrinter.printNewLine("cabId: " + cabId + " Location: (" + locationX + ", " + locationX + ")");
    }
}
