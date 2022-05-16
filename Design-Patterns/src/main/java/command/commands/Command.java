package command.commands;

public interface Command {
    public void execute(String command);
    public boolean matches(String command);
}
