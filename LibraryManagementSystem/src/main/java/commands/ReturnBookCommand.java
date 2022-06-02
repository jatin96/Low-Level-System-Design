package commands;

public class ReturnBookCommand implements Command {
    public static final String COMMAND_NAME = "return_book_copy";

    @Override
    public void execute(String input) {
        System.out.println("book returned :)");
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
