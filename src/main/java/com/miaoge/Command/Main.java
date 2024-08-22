package com.miaoge.Command;

import com.miaoge.Command.Command.Command;
import com.miaoge.Command.Command.Impl.BakeChickenWingCommand;
import com.miaoge.Command.Command.Impl.BakeMuttonCommand;

public class Main {
    public static void main(String[] args) {
        BarbeCuer boy = new BarbeCuer(); //烤肉厨师
        Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
        Command bakeChickenWingCommand1 = new BakeChickenWingCommand(boy);
        Waiter girl = new Waiter();

        System.out.println("开门营业，顾客点菜");
        girl.setOrder(bakeMuttonCommand1); //下单烤羊肉串
        girl.setOrder(bakeMuttonCommand1); //下单烤羊肉串
        girl.setOrder(bakeMuttonCommand1); //下单烤羊肉串
        girl.setOrder(bakeMuttonCommand1); //下单烤羊肉串
        girl.setOrder(bakeChickenWingCommand1);  //下单烤鸡翅
        girl.cancelOrder(bakeMuttonCommand1); //取消一串烤羊肉串

        System.out.println("点菜完毕，通知厨房烧菜");
        girl.notifyCommand(); //通知厨师
    }
}
