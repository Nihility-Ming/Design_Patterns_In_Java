package com.miaoge.Command.Command.Impl;

import com.miaoge.Command.BarbeCuer;
import com.miaoge.Command.Command.Command;

public class BakeMuttonCommand extends Command {
    public BakeMuttonCommand(BarbeCuer receiver) {
        super(receiver);
    }

    @Override
    public void excuteCommand() {
        receiver.bakeMutton();
    }
}
