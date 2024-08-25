package com.miaoge.ResponsibilityChain.Superior.Impl;

import com.miaoge.ResponsibilityChain.Leave;
import com.miaoge.ResponsibilityChain.Result;
import com.miaoge.ResponsibilityChain.Superior.Superior;

public class Manager extends Superior {

    @Override
    public void approvalWithLeave(Leave leave) {
        if (leave.getDay() >=3 && leave.getDay() < 10) {
            Result.printSuccessfulResult(leave, this);
        } else {
            this.getNextSuperior().approvalWithLeave(leave);
        }
    }

    @Override
    public String toString() {
        return "经理";
    }
}
