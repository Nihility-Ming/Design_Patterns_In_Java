package com.miaoge.SimpleFactory;

import com.miaoge.SimpleFactory.Operation.Operation;

public class Main {
    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperation("+");
        if (operation != null) {
            operation.setA(10d);
            operation.setB(20d);
            System.out.println(operation.getResult());
        }

        Operation operation2 = OperationFactory.createOperation("-");
        if (operation2 != null) {
            operation2.setA(10d);
            operation2.setB(20d);
            System.out.println(operation2.getResult());
        }

        Operation operation3 = OperationFactory.createOperation("*");
        if (operation3 != null) {
            operation3.setA(10d);
            operation3.setB(20d);
            System.out.println(operation3.getResult());
        }

        Operation operation4 = OperationFactory.createOperation("/");
        if (operation4 != null) {
            operation4.setA(10d);
            operation4.setB(20d);
            System.out.println(operation4.getResult());
        }
    }
}
