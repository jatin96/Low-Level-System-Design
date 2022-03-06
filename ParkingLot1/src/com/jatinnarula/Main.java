package com.jatinnarula;

import com.jatinnarula.commands.CommandExecutorFactory;
import com.jatinnarula.exceptions.InvalidModeException;
import com.jatinnarula.mode.FileMode;
import com.jatinnarula.mode.InteractiveMode;
import com.jatinnarula.mode.Mode;
import com.jatinnarula.service.ParkingLotService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        final OutputPrinter outputPrinter = new OutputPrinter();
        final ParkingLotService parkingService = new ParkingLotService();
        final CommandExecutorFactory commandExecutorFactory =
                new CommandExecutorFactory(parkingService);

        if (isInteractiveMode(args)) {
            Mode interactiveMode = new InteractiveMode(commandExecutorFactory, outputPrinter);
            interactiveMode.process();
        } else if (isFileMode(args)) {
            Mode fileMode = new FileMode(commandExecutorFactory, outputPrinter, args[0]);
            fileMode.process();
        } else {
            throw new InvalidModeException();
        }
    }

    private static boolean isInteractiveMode(String[] args) { return args.length == 0; }
    private static boolean isFileMode(String[] args) { return args.length == 1; }

}
