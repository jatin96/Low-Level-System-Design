package commands;

public class PrintBorrowedCommand implements Command {
    public static final String COMMAND_NAME = "print_borrowed";

    @Override
    public void execute(String input) {
        System.out.println("books printed :O");
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
