package com.miaoge.SimpleFactory;

import com.miaoge.SimpleFactory.Operation.Impl.Add;
import com.miaoge.SimpleFactory.Operation.Impl.Div;
import com.miaoge.SimpleFactory.Operation.Impl.Mul;
import com.miaoge.SimpleFactory.Operation.Impl.Sub;
import com.miaoge.SimpleFactory.Operation.Operation;

public class OperationFactory {
    public static Operation createOperation(String operation) {
        return switch (operation) {
            case "+" -> new Add();
            case "-" -> new Sub();
            case "*" -> new Mul();
            case "/" -> new Div();
            default -> null;
        };

    }
}
