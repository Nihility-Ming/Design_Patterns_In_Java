package com.miaoge.Command;

import com.miaoge.Command.Command.Command;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Waiter {
    private ArrayList<Command> orders = new ArrayList<>();

    public void setOrder(Command command) {
        String className = command.getClass().getSimpleName();

        if (className.equals("BakeChickenWingCommand")) {
            System.out.println("服务员：鸡翅没有了，请点别的烧烤。");
        } else {
            orders.add(command);
            System.out.println("增加订单：" + className + " 时间：" + getNowTime());
        }
    }

    public void cancelOrder(Command command) {
        orders.remove(command);
        String className = command.getClass().getSimpleName();
        System.out.println("取消订单：" + className +" 时间：" + getNowTime());
    }

    public void notifyCommand() {
        for (Command command : orders) {
            command.excuteCommand();
        }
    }

    private String getNowTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date());
    }
}
