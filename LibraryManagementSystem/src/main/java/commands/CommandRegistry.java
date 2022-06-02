package commands;

import controllers.BookController;
import controllers.LibraryController;
import services.BookService;
import services.LibraryService;

import java.util.ArrayList;
import java.util.List;

public class CommandRegistry {
    List<Command> commands = new ArrayList<>();

    public CommandRegistry(LibraryService libraryService, BookService bookService) {
        commands.add(new CreateLibraryCommand(new LibraryController(libraryService)));
        commands.add(new AddBookCommand(new BookController(bookService)));
       commands.add(new BorrowBookCommand());
       commands.add(new BorrowBookCopyCommand());
       commands.add(new ExitCommand());
       commands.add(new PrintBorrowedCommand());
       commands.add(new RemoveBookCopyCommand());
       commands.add(new ReturnBookCommand());
       commands.add(new SearchCommand());
    }

    public void register(Command command) {
        commands.add(command);
    }

    public void deregister(Command command) {
        // TODO: validate the command here.
        commands.remove(command);
    }

    // TODO: should we implement matches in each class or in registry ? check online
    public void execute(String input) {
        for (Command command : commands) {
            if (command.matches(input) && command.validate(input)) {
                command.execute(input);
            }
        }
    }
}
