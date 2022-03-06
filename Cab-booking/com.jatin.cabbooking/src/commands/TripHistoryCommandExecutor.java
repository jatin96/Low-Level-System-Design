package commands;

import models.Command;
import models.Trip;
import service.CabBookingService;
import utilities.OutputPrinter;

import java.util.List;

public class TripHistoryCommandExecutor extends CommandExecutor {

    public static final String COMMAND_NAME = "trip_history";

    public TripHistoryCommandExecutor(final CabBookingService cabBookingService,
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

        List<Trip> trips = cabBookingService.getTripHistory(command.getParams().get(0));
        outputPrinter.printNewLine("Rider \t Cab \t from \t to \t price \t status");
        for (Trip trip : trips) {
            outputPrinter.printNewLine(trip.getRider().getRiderId() + " \t " +
                    trip.getCab().getCabId() + " \t " +
                    trip.getFrom().getX() + ", " + trip.getFrom().getY() + " \t " +
                    trip.getTo().getX() + ", " + trip.getTo().getY() + " \t " +
                    trip.getPrice() + " \t " +
                    trip.getTripStatus());
        }
    }
}
