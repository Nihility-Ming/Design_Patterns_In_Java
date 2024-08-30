package com.miaoge.Composite.Components.Impl;

import com.miaoge.Composite.Components.Components;

public class Leaf extends Components {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Components components) {
        System.out.println("Cannot add to a leaf");
    }

    @Override
    public void remove(Components components) {
        System.out.println("Cannot remove from a leaf");
    }

    @Override
    public void display(Integer depth) {
        String str = "-";
        for (int i=0; i<depth; i++) {
            str += str;
        }
        System.out.println(String.format("%s %s", str, this.name));
    }
}
