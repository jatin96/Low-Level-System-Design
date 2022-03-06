package commands;

import models.Command;
import models.Rider;
import service.CabBookingService;
import utilities.OutputPrinter;

public class RegisterRiderCommandExecutor extends CommandExecutor {

    public final static String COMMAND_NAME = "register_rider";

    public RegisterRiderCommandExecutor(final CabBookingService cabBookingService,
                                        OutputPrinter outputPrinter) {
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
        String riderId = command.getParams().get(0);
        String riderName = command.getParams().get(1);
        cabBookingService.registerRider(new Rider(riderId, riderName));
        outputPrinter.printNewLine("Rider registered : " + riderId + " , " + riderName);
    }
}
