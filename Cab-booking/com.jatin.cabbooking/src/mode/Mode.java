package mode;

import commands.CommandExecutor;
import commands.CommandExecutorFactory;
import exceptions.InvalidCommandException;
import models.Command;
import utilities.OutputPrinter;

import java.io.IOException;

public abstract class Mode {
    private CommandExecutorFactory commandExecutorFactory;
    protected OutputPrinter outputPrinter;
    public Mode(final CommandExecutorFactory commandExecutorFactory, final OutputPrinter outputPrinter) {
        this.commandExecutorFactory = commandExecutorFactory;
        this.outputPrinter = outputPrinter;
    }

    public void processCommand(Command command) {
        final CommandExecutor commandExecutor = commandExecutorFactory.getCommandExecutor(command);

        if (!commandExecutor.validate(command)) {
            throw new InvalidCommandException();
        }

        commandExecutor.execute(command);
    }

    public abstract void process() throws IOException;
}
