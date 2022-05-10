import commands.CommandRegistry;
import commands.CreateGame;
import commands.CreateUser;
import exceptions.InvalidCommandException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) {
        CommandRegistry commandRegistry = createRegistry();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println(">");
            try {
                String input = bufferedReader.readLine().toString();
                commandRegistry.execute(input);
            } catch(InvalidCommandException e) {
                System.out.println("Invalid command entered");
            } catch(IOException e) {
                System.out.println("System Error");
            }

        }
    }

    private static CommandRegistry createRegistry() {
        CommandRegistry registry = new CommandRegistry();
        registry.register(new CreateUser());
        registry.register(new CreateGame());
        return registry;
    }

}
