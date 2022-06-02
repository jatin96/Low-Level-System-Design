import commands.CommandRegistry;
import repositories.BookRepository;
import repositories.LibraryRepository;
import services.BookService;
import services.LibraryService;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        //============= initializations ==================================

        // Repositories
        LibraryRepository libraryRepository = new LibraryRepository();
        BookRepository bookRepository = new BookRepository();

        // Services
        LibraryService libraryService = new LibraryService(libraryRepository);
        BookService bookService = new BookService(bookRepository, libraryService);

        // Registries
        CommandRegistry commandRegistry = new CommandRegistry(libraryService, bookService);
        // ending initializations

        System.out.println("Starting library management system... give your commands now");
        while(true) {
            String input = bf.readLine();
            commandRegistry.execute(input);
        }
    }
}
