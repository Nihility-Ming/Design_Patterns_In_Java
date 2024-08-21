package com.miaoge.Adapter;

import com.miaoge.Adapter.Player.Impl.Center;
import com.miaoge.Adapter.Player.Impl.Forwards;
import com.miaoge.Adapter.Player.Player;

public class Main {
    public static void main(String[] args) {
        Player player = new Translator("翻译者");
        player.attack();

        Player player1 = new Center("大鲨鱼奥尔顿");
        player1.attack();

        Player player2 = new Forwards("科比");
        player2.attack();
    }
}
