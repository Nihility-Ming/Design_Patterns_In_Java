package com.miaoge.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();

        Singleton b = Singleton.getInstance();

        System.out.println(a == b);
    }
}
