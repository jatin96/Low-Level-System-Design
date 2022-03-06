package com.jatinnarula.mode;

import com.jatinnarula.OutputPrinter;
import com.jatinnarula.commands.CommandExecutor;
import com.jatinnarula.commands.CommandExecutorFactory;
import com.jatinnarula.commands.ParkCommandExecutor;
import com.jatinnarula.exceptions.InvalidCommandException;
import com.jatinnarula.model.Command;

import java.io.IOException;

public abstract class Mode {
    protected OutputPrinter outputPrinter;
    private CommandExecutorFactory commandExecutorFactory;
    public Mode(
            final CommandExecutorFactory commandExecutorFactory,
            final OutputPrinter outputPrinter) {
        this.outputPrinter = outputPrinter;
        this.commandExecutorFactory = commandExecutorFactory;
    }

    protected void processCommand(final Command command) {
        final CommandExecutor commandExecutor = commandExecutorFactory.getCommandExecutor(command);

        if (commandExecutor.validate(command)) {
            commandExecutor.execute(command);
        } else {
            throw new InvalidCommandException();
        }
    }

    public abstract void process() throws IOException;

}
