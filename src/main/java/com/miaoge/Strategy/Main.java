package com.miaoge.Strategy;

public class Main {
    public static void main(String[] args) {
        CashContext cashContext = new CashContext(1);
        Double result = cashContext.getResult(500d, 2);
        System.out.println(result);

        cashContext = new CashContext(2);
        result = cashContext.getResult(500d, 2);
        System.out.println(result);

        cashContext = new CashContext(3);
        result = cashContext.getResult(500d, 2);
        System.out.println(result);

        cashContext = new CashContext(4);
        result = cashContext.getResult(500d, 2);
        System.out.println(result);

    }
}
