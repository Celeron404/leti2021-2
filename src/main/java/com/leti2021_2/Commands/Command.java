package com.leti2021_2.Commands;

import com.leti2021_2.UserData;

abstract public class Command {
    protected UserData userData;

    public Command(UserData userData) { this.userData = userData; }

    public abstract void execute();
}
