package com.jatinnarula.model;

import com.jatinnarula.OutputPrinter;
import com.jatinnarula.exceptions.InvalidCommandException;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Command {
    private static final String SPACE = " ";
    private String commandName;
    private List<String> params;

    public String getCommandName() {
        return commandName;
    }

    public List<String> getParams() {
        return params;
    }

    public Command(final String inputLine) {
        List<String> tokensList = List.of(inputLine.trim().split(" "));
        if (tokensList.size() == 0) {
            throw new InvalidCommandException();
        }

        commandName = tokensList.get(0).toLowerCase();
        List<String> paramsTmp = new ArrayList<>();
        for (int i = 1; i < tokensList.size(); i++) {
            paramsTmp.add(tokensList.get(i));
        }
        params = paramsTmp;
    }
}
