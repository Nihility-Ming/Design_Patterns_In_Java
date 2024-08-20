package com.miaoge.Status.Status.Impl;

import com.miaoge.Status.Status.State;
import com.miaoge.Status.Work;

public class EveningState extends State {
    @Override
    public void writeProgram(Work w) {
        if (w.getWorkfinished()) {
            w.setCurrentStatus(new RestState());
            w.writeProgram();
        } else {
            if (w.getHour() <= 21) {
                System.out.println("当前时间" + w.getHour() + "点 加班哦，疲累至极");
            } else {
                w.setCurrentStatus(new SleepingState());
                w.writeProgram();
            }
        }
    }
}
