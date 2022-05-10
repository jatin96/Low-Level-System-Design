package commands;

import controllers.UserController;

import java.util.List;

public class CreateUser implements Command {

    private String COMMAND_NAME = "create_user";
    private UserController userController = new UserController();
    @Override
    public void execute(String command) {
        List<String> tokens = List.of(command.split(" "));
        String username = tokens.get(1);
        String email = tokens.get(2);
        userController.createUser(username, email);
        System.out.println("Create user executed.");
    }

    @Override
    public boolean matches(String command) {
        List<String> tokens = List.of(command.split(" "));
        if (tokens.size() > 0 && tokens.get(0).equals(COMMAND_NAME)) return true;

        return false;
    }
}
