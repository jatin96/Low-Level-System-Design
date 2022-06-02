package commands;

import controllers.BookController;
import models.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddBookCommand implements Command{
    public static final String COMMAND_NAME = "add_book";
    private BookController bookController;

    public AddBookCommand(BookController bookController) {
        this.bookController = bookController;
    }

    @Override
    public void execute(String input) {
        String[] inputArray = input.split(" ");
        int id = Integer.parseInt(inputArray[1]);
        String title = inputArray[2];
        List<String> authors = Arrays.asList(inputArray[3].split(","));
        List<String> publishers = Arrays.asList(inputArray[4].split(","));
        List<String> bookCopyIds = Arrays.asList(inputArray[5].split(","));
        List<Integer> bookCopyIDsInInt = new ArrayList<>();

        for (String bookCopyId : bookCopyIds) {
            bookCopyIDsInInt.add(Integer.parseInt(bookCopyId));
        }

        try {
            List<Integer> rackNos = bookController.addBook(id, title, authors, publishers, bookCopyIDsInInt);
            System.out.print("Added Book to racks: ");
            for (Integer rackNo : rackNos) {
                System.out.print(rackNo + ",");
            }
            System.out.println();

        } catch (RuntimeException e) {
            System.out.println("Rack not available");
        }
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
