package com.miaoge.Adapter;

import com.miaoge.Adapter.Player.Player;

public class Translator extends Player {

    private ForeignCenter foreignCenter = new ForeignCenter("姚明");

    public Translator(String name) {
        super(name);
    }

    @Override
    public void attack() {
        foreignCenter.进攻();
    }

    @Override
    public void defense() {
        foreignCenter.防守();
    }
}
