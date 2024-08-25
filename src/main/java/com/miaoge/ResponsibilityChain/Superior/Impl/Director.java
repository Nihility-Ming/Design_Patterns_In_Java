package com.miaoge.ResponsibilityChain.Superior.Impl;

import com.miaoge.ResponsibilityChain.Leave;
import com.miaoge.ResponsibilityChain.Result;
import com.miaoge.ResponsibilityChain.Superior.Superior;

public class Director extends Superior {
    @Override
    public void approvalWithLeave(Leave leave) {
        if (leave.getDay() > 0 && leave.getDay()  <3) {
            Result.printSuccessfulResult(leave, this);
        } else {
            this.getNextSuperior().approvalWithLeave(leave);
        }
    }

    @Override
    public String toString() {
        return "医生";
    }
}
