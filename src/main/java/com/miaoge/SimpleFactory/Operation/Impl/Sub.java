package com.miaoge.SimpleFactory.Operation.Impl;

import com.miaoge.SimpleFactory.Operation.Operation;

public class Sub extends Operation {
    @Override
    public Double getResult() {
        return getA() - getB();
    }
}
