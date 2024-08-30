package com.miaoge.Composite.Components.Impl;

import com.miaoge.Composite.Components.Components;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Components {

    public List<Components> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Components components) {
        children.add(components);
    }

    @Override
    public void remove(Components components) {
        children.remove(components);
    }

    @Override
    public void display(Integer depth) {
        String str = "-";
        for (int i=0; i<depth; i++) {
            str += str;
        }

        System.out.println(String.format("%s %s", str, this.name));

        for (Components comp : children) {
            comp.display(depth+1);
        }
    }
}
