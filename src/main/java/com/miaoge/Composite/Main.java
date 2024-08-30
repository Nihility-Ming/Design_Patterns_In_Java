package com.miaoge.Composite;

import com.miaoge.Composite.Components.Components;
import com.miaoge.Composite.Components.Impl.Composite;
import com.miaoge.Composite.Components.Impl.Leaf;

public class Main {
    public static void main(String[] args) {
        Components root = new Composite("Root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Components comp = new Composite("Composite X");
        comp.add(new Leaf("LeafX A"));
        comp.add(new Leaf("LeafX B"));
        root.add(comp);

        Components comp2 = new Composite("Composite XY");
        comp2.add(new Leaf("LeafXY A"));
        comp2.add(new Leaf("LeafXY B"));
        comp.add(comp2);

        root.add(new Leaf("Leaf C"));

        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
        root.remove(leaf);

        root.display(0);
    }
}
