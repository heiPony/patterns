package com.pony.patterns.action.command.command;

import com.pony.patterns.action.command.Command;
import com.pony.patterns.action.command.handler.NewerHandler;

public class NewerCommand extends Command {
    private NewerHandler handler = new NewerHandler();

    @Override
    public String execute() {
        return handler.getNewers();
    }
}
