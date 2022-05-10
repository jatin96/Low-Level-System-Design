package commands;

import java.util.List;

public interface Command {

    void execute(String command);

    boolean matches(String command);

}
