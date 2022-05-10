package commands;

import exceptions.InvalidCommandException;

import java.util.ArrayList;
import java.util.List;

public class CommandRegistry {
    List<Command> commands = new ArrayList<>();

    public void register(Command command) {
        commands.add(command);
    }

    public void deregister(Command command) {
        commands.remove(command);
    }

    public void execute(String incomingCommand) {
        for (Command command : commands) {
            if (command.matches(incomingCommand)) {
                command.execute(incomingCommand);
                return;
            }
        }

        throw new InvalidCommandException();
    }
}
