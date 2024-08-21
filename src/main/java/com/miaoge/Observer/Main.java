package com.miaoge.Observer;

import com.miaoge.Observer.Observer.Impl.NBAObserver;
import com.miaoge.Observer.Observer.Impl.StockObserver;
import com.miaoge.Observer.Observer.Observer;
import com.miaoge.Observer.Subject.Impl.Boss;
import com.miaoge.Observer.Subject.Impl.Secretary;
import com.miaoge.Observer.Subject.Subject;

public class Main {
    public static void main(String[] args) {
        Subject boss = new Boss("张老板");
        Subject bXiaoHong = new Secretary("前台小红");

        Observer xiaoH = new StockObserver();
        Observer xiaoO = new NBAObserver();

        boss.attach(xiaoH);
        boss.attach(xiaoO);
        boss.notifyObservers();

        bXiaoHong.attach(xiaoH);
        bXiaoHong.attach(xiaoO);
        bXiaoHong.detach(xiaoO);
        bXiaoHong.notifyObservers();
    }
}
