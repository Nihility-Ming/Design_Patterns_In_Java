package com.miaoge.Memento;

public class Main {
    public static void main(String[] args) {
        Role role = new Role();
        Caretaker caretaker = new Caretaker();

        System.out.println("... 刚开局 ... 满血状态");
        role.initState();
        role.printState();

        // 打BOSS前先保存一下状态
        caretaker.setMemento1(role.createMementoState());

        System.out.println("... 打BOSS ... 死亡状态");
        role.deadState();
        role.printState();

        // 恢复打BOSS前的状态
        role.recoverStateWithMemento(caretaker.getMemento1());
        System.out.println("恢复打BOSS前的状态");
        role.printState();
    }
}
