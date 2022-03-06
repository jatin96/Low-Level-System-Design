package commands;

import exceptions.InvalidCommandException;
import models.Command;
import service.CabBookingService;
import utilities.OutputPrinter;

import java.util.HashMap;
import java.util.Map;

public class CommandExecutorFactory {
    private Map<String, CommandExecutor> commands = new HashMap<>();

    public CommandExecutorFactory(final CabBookingService cabBookingService,
                                  final OutputPrinter outputPrinter) {

        commands.put(ExitCommandExecutor.COMMAND_NAME,
                new ExitCommandExecutor(cabBookingService, outputPrinter));

        commands.put(RegisterCabCommandExecutor.COMMAND_NAME,
                new RegisterCabCommandExecutor(cabBookingService, outputPrinter));

        commands.put(RegisterRiderCommandExecutor.COMMAND_NAME,
                new RegisterRiderCommandExecutor(cabBookingService, outputPrinter));

        commands.put(UpdateCabLocationCommandExecutor.COMMAND_NAME,
                new UpdateCabLocationCommandExecutor(cabBookingService, outputPrinter));

        commands.put(UpdateDriverAvailabilityCommandExecutor.COMMAND_NAME,
                new UpdateDriverAvailabilityCommandExecutor(cabBookingService, outputPrinter));

        commands.put(TripHistoryCommandExecutor.COMMAND_NAME,
                new TripHistoryCommandExecutor(cabBookingService, outputPrinter));

        commands.put(BookTripCommandExecutor.COMMAND_NAME,
                new BookTripCommandExecutor(cabBookingService, outputPrinter));

        commands.put(EndTripCommandExecutor.COMMAND_NAME,
                new EndTripCommandExecutor(cabBookingService, outputPrinter));

    }

    public CommandExecutor getCommandExecutor(final Command command) {
        final CommandExecutor commandExecutor = commands.get(command.getCommandName());
        if (commandExecutor == null) {
            throw new InvalidCommandException();
        }

        return commandExecutor;
    }
}
