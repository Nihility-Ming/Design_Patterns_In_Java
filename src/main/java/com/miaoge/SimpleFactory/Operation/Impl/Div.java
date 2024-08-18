package com.miaoge.SimpleFactory.Operation.Impl;

import com.miaoge.SimpleFactory.Operation.Operation;

public class Div extends Operation {
    @Override
    public Double getResult() {
        if (getB() == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return getA() / getB();
    }
}
