package com.miaoge.Composite.Components;

public abstract class Components {
    public abstract void add(Components components);

    public abstract void remove(Components components);

    public abstract void display(Integer depth);

    public String name;

    public Components(String name) {
        this.name = name;
    }
}
