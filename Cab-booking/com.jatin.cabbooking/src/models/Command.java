package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Command {
    String commandName;
    List<String> params;

    public Command(String input) {
        List<String> inputList = Arrays.stream(input.split(" ")).toList();
        commandName = inputList.get(0);
        params = new ArrayList<String>();

        for (int i = 1; i < inputList.size(); i++)
            params.add(inputList.get(i));
    }

    public String getCommandName() {
        return commandName;
    }

    public List<String> getParams() {
        return params;
    }
}
