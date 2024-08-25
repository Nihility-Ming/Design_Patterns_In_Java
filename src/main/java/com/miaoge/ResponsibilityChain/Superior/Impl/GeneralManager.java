package com.miaoge.ResponsibilityChain.Superior.Impl;

import com.miaoge.ResponsibilityChain.Leave;
import com.miaoge.ResponsibilityChain.Result;
import com.miaoge.ResponsibilityChain.Superior.Superior;

public class GeneralManager extends Superior {
    @Override
    public void approvalWithLeave(Leave leave) {
        if (leave.getDay() >= 10 && leave.getDay() < 30) {
            Result.printSuccessfulResult(leave, this);
        } else {
            Result.printUnsuccessfulResult(leave);
        }
    }

    @Override
    public String toString() {
        return "总经理";
    }
}
