package commands;

import models.Command;
import models.Location;
import models.Trip;
import service.CabBookingService;
import utilities.OutputPrinter;

public class BookTripCommandExecutor extends CommandExecutor {

    public static final String COMMAND_NAME = "book_trip";

    public BookTripCommandExecutor(final CabBookingService cabBookingService,
                                   final OutputPrinter outputPrinter) {
        super(cabBookingService, outputPrinter);
    }

    @Override
    public boolean validate(Command command) {
        if (command.getParams().size() != 5)
            return false;

        return true;
    }

    @Override
    public void execute(Command command) {
        final String riderId = command.getParams().get(0);
        final Location from = new Location(
                Double.parseDouble(command.getParams().get(1)),
                Double.parseDouble((command.getParams().get(2)))
        );

        final Location to = new Location(
                Double.parseDouble(command.getParams().get(3)),
                Double.parseDouble((command.getParams().get(4)))
        );

        Trip trip = cabBookingService.bookTrip(riderId, from, to);
        outputPrinter.printNewLine("trip booked");
        outputPrinter.printNewLine(" Cab : " + trip.getCab().getCabId() + " price: " + trip.getPrice());
    }
}
