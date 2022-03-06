package commands;

import models.Command;
import service.CabBookingService;
import utilities.OutputPrinter;

public class ExitCommandExecutor extends CommandExecutor {
    public final static String COMMAND_NAME = "exit";

    public ExitCommandExecutor(final CabBookingService cabBookingService,
                               final OutputPrinter outputPrinter) {
        super(cabBookingService, outputPrinter);
    }

    @Override
    public boolean validate(Command command) {
        return false;
    }

    @Override
    public void execute(Command command) {
        outputPrinter.end();
        System.exit(0);
    }
}
