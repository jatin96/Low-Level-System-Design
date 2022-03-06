package mode;

import commands.CommandExecutorFactory;
import commands.ExitCommandExecutor;
import models.Command;
import utilities.OutputPrinter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InteractiveMode extends Mode {

    public InteractiveMode(final CommandExecutorFactory commandExecutorFactory, final OutputPrinter outputPrinter) {
        super(commandExecutorFactory, outputPrinter);
    }

    @Override
    public void process() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        outputPrinter.welcome();
        while(true) {
            final String input = reader.readLine();
            final Command command = new Command(input);
            processCommand(command);
        }

    }
}
