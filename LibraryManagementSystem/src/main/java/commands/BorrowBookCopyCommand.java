package commands;

public class BorrowBookCopyCommand implements Command {
    public static final String COMMAND_NAME = "borrow_book_copy";

    @Override
    public void execute(String input) {
        System.out.println("book copy borrowed :(");
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
