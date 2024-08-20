package com.miaoge.Status.Status.Impl;

import com.miaoge.Status.Status.State;
import com.miaoge.Status.Work;

public class ForenoonState extends State {
    @Override
    public void writeProgram(Work w) {
        if (w.getHour() <= 12) {
            System.out.println("当前时间：" + w.getHour() + "点 上午工作，精神百倍");
        } else {
            w.setCurrentStatus(new NoonState());
            w.writeProgram();
        }
    }
}
