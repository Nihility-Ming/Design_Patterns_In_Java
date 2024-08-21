package com.miaoge.Observer.Subject;

import com.miaoge.Observer.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    protected String name;
    public Subject(String name) {
        this.name = name;
    }

    private final List<Observer> list = new ArrayList<>();

    private String action;

    public void attach(Observer observer) {
        list.add(observer);
    }

    public void detach(Observer observer) {
        list.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : list) {
            observer.update(this);
        }
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
