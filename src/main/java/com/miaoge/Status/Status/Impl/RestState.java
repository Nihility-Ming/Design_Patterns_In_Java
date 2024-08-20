package com.miaoge.Status.Status.Impl;

import com.miaoge.Status.Status.State;
import com.miaoge.Status.Work;

public class RestState extends State {
    @Override
    public void writeProgram(Work w) {
        System.out.println("当前时间：" + w.getHour() + "点 下班回家了");
    }
}
