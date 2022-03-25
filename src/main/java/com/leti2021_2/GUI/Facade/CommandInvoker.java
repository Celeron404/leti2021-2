package com.leti2021_2.GUI.Facade;

import com.leti2021_2.Commands.Command;

public class CommandInvoker {
    private Command command;

    public CommandInvoker(Command command) {
        this.command = command;
    }

    public CommandInvoker() {}



    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
