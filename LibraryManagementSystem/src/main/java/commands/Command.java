package commands;

public interface Command {
    public void execute(String input);
    public boolean matches(String input);
    public boolean validate(String input);
}
