package com.miaoge.Command.Command.Impl;

import com.miaoge.Command.BarbeCuer;
import com.miaoge.Command.Command.Command;

public class BakeChickenWingCommand extends Command {
    public BakeChickenWingCommand(BarbeCuer receiver) {
        super(receiver);
    }

    @Override
    public void excuteCommand() {
        receiver.bakeChickenWing();
    }
}
