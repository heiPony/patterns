package com.pony.patterns.action.command.command;

import com.pony.patterns.action.command.Command;
import com.pony.patterns.action.command.handler.DiscountHandler;

public class DiscountCommand extends Command {

    private DiscountHandler handler = new DiscountHandler();

    @Override
    public String execute() {
        return handler.getDiscounts();
    }
}
