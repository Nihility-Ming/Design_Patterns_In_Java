package com.miaoge.ResponsibilityChain;

import com.miaoge.ResponsibilityChain.Superior.Impl.Director;
import com.miaoge.ResponsibilityChain.Superior.Impl.GeneralManager;
import com.miaoge.ResponsibilityChain.Superior.Impl.Manager;
import com.miaoge.ResponsibilityChain.Superior.Superior;

public class Main {
    public static void main(String[] args) {
        Leave leave_1 = new Leave();
        leave_1.setContent("去看病");
        leave_1.setDay(2);
        leave_1.setProposer("阿李罗");

        Leave leave_2 = new Leave();
        leave_2.setContent("产假");
        leave_2.setDay(180);
        leave_2.setProposer("小姐");

        Superior director = new Director();
        Superior manager = new Manager();
        Superior generalManager = new GeneralManager();

        director.setNextSuperior(manager);
        manager.setNextSuperior(generalManager);

        director.approvalWithLeave(leave_1);
        director.approvalWithLeave(leave_2);
    }
}
