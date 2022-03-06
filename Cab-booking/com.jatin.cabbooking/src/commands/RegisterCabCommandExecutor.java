package commands;

import models.Cab;
import models.Command;
import service.CabBookingService;
import utilities.OutputPrinter;

public class RegisterCabCommandExecutor extends CommandExecutor {

    public final static String COMMAND_NAME = "register_cab";

    public RegisterCabCommandExecutor(final CabBookingService cabBookingService,
                                        final OutputPrinter outputPrinter) {
        super(cabBookingService, outputPrinter);
    }
    @Override
    public boolean validate(Command command) {
        if (command.getParams().size() != 2)
            return false;

        return true;
    }

    @Override
    public void execute(Command command) {
        String cabId = command.getParams().get(0);
        String cabName = command.getParams().get(1);

        cabBookingService.registerCab(new Cab(cabId, cabName));

        outputPrinter.printNewLine("Cab registered : " + cabId + ", " + cabName);
    }
}
