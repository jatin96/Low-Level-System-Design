package commands;

public class ExitCommand implements Command {
    public static final String COMMAND_NAME = "exit";

    @Override
    public void execute(String input) {
        System.out.println("Closing system...bye");
        System.exit(0);
    }

    @Override
    public boolean matches(String input) {
        String[] inputArray = input.split(" ");
        String commandName = inputArray[0];
        return commandName.equalsIgnoreCase(COMMAND_NAME);
    }

    @Override
    public boolean validate(String input) {
        return true;
    }
}
