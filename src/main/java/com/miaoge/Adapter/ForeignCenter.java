package com.miaoge.Adapter;

public class ForeignCenter {
    public String name;

    public ForeignCenter(String name) {
        this.name = name;
    }

    public void 进攻() {
        System.out.println("中锋" + this.name + "进攻" );
    }

    public void 防守() {
        System.out.println("中锋" + this.name + "防守");
    }
}
