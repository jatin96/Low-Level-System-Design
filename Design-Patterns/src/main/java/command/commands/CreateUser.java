package command.commands;

import java.util.Arrays;
import java.util.List;

public class CreateUser implements Command {

    public static final String COMMAND_NAME = "create_user";
    @Override
    public void execute(String command) {
        // Create user here using controllers. Take controller from constructor
        List<String> tokens = Arrays.asList(command.split(" "));
        System.out.println("user created");
    }

    @Override
    public boolean matches(String command) {
        // validate the given command
        return true;
    }
}
