package commands;

import controllers.LibraryController;
import models.Library;

import java.util.Arrays;
import java.util.List;

public class CreateLibraryCommand implements Command {

    private LibraryController libraryController;

    public CreateLibraryCommand(LibraryController libraryController) {
        this.libraryController = libraryController;
    }

    public static final String COMMAND_NAME = "create_library";
    @Override
    public void execute(String input) {
        String[] inputArray = input.split(" ");

        Library library = libraryController.createLibrary(Integer.parseInt(inputArray[1]), Integer.parseInt(inputArray[2]));

        System.out.println("Created Library : " + library);
    }

    @Override
    public boolean matches(String input) {
        String[] inputArray = input.split(" ");
        String commandName = inputArray[0];
        return commandName.equalsIgnoreCase(COMMAND_NAME);
    }

    @Override
    public boolean validate(String input) {
        // TODO: check how to implement this online. Should we return true / false or through exception here or outside ?
      return true;
    }
}
