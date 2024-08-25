package com.miaoge.ResponsibilityChain.Superior;

import com.miaoge.ResponsibilityChain.Leave;

public abstract class Superior {

    private Superior nextSuperior;

    public abstract void approvalWithLeave(Leave leave);

    public Superior getNextSuperior() {
        return nextSuperior;
    }

    public void setNextSuperior(Superior nextSuperior) {
        this.nextSuperior = nextSuperior;
    }
}
