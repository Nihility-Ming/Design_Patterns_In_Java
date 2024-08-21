package com.miaoge.Adapter.Player.Impl;

import com.miaoge.Adapter.Player.Player;

public class Center extends Player {

    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("中锋" + this.name + "进攻");
    }

    @Override
    public void defense() {
        System.out.println("中锋" + this.name + "防守");
    }
}
