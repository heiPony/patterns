package com.pony.patterns.action.command.command;

import com.pony.patterns.action.command.Command;
import com.pony.patterns.action.command.handler.HotHandler;

public class HotCommand extends Command {
    private HotHandler handler = new HotHandler();

    @Override
    public String execute() {
        return handler.getHots();
    }
}
