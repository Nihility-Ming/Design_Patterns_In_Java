package com.miaoge.Observer.Observer.Impl;

import com.miaoge.Observer.Observer.Observer;
import com.miaoge.Observer.Subject.Subject;

public class StockObserver extends Observer {
    @Override
    public void update(Subject subject) {
        System.out.println(subject.getClass().getSimpleName() + "通知后：" + "StockObserver update");
    }
}
