package com.miaoge.Prototype;

public class Main {
    public static void main(String[] args) {
        Dog aDog = new Dog("小王", 2);
        Dog bDog = aDog.clone();
        bDog.setName("小黑");

        System.out.println(aDog == bDog);

        System.out.println(aDog);
        System.out.println(bDog);
    }
}
