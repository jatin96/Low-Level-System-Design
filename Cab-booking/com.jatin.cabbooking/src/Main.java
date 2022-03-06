import commands.CommandExecutorFactory;
import managers.CabManager;
import managers.RiderManager;
import managers.TripsManager;
import mode.InteractiveMode;
import mode.Mode;
import service.CabBookingService;
import strategies.DefaultCabMatchingStrategy;
import strategies.DefaultPricingStrategy;
import utilities.OutputPrinter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        OutputPrinter outputPrinter = new OutputPrinter();
        RiderManager riderManager = new RiderManager();
        CabManager cabManager = new CabManager();
        TripsManager tripsManager = new TripsManager(cabManager, new DefaultCabMatchingStrategy(), new DefaultPricingStrategy());
        CabBookingService cabBookingService = new CabBookingService(riderManager, cabManager, tripsManager);
        CommandExecutorFactory commandExecutorFactory = new CommandExecutorFactory(cabBookingService, outputPrinter);
        Mode interactiveMode = new InteractiveMode(commandExecutorFactory, outputPrinter);
        interactiveMode.process();
    }
}
