package commands;

public class RemoveBookCopyCommand implements Command {
    public static final String COMMAND_NAME = "remove_book_copy";

    @Override
    public void execute(String input) {
        System.out.println("book copy removed :(");
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
