package command;

import command.commands.Command;
import command.commands.CommandRegistry;
import command.commands.CreateUser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException {
        CommandRegistry commandRegistry = createRegistry();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println(">");
            try {
                String input = br.readLine().toString();
                commandRegistry.execute(input);
            } catch (IOException e) { }
        }
    }

    private static CommandRegistry createRegistry() {
        CommandRegistry commandRegistry = new CommandRegistry();
        commandRegistry.register(new CreateUser());
        return commandRegistry;
    }
}
