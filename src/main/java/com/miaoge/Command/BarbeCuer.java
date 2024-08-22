package com.miaoge.Command;

public class BarbeCuer {
    public void bakeMutton() {
        System.out.println(this.getClass().getSimpleName() +"：烤羊肉串");
    }

    public void bakeChickenWing() {
        System.out.println(this.getClass().getSimpleName() + "：烤鸡翅");
    }
}
