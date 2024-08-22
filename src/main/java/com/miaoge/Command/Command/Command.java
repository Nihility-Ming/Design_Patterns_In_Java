package com.miaoge.Command.Command;

import com.miaoge.Command.BarbeCuer;

public abstract class Command {

    public Command(BarbeCuer receiver) {
        this.receiver = receiver;
    }

    protected BarbeCuer receiver;

    public abstract void excuteCommand();
}
