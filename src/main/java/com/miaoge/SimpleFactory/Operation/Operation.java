package com.miaoge.SimpleFactory.Operation;

public abstract class Operation {
    private Double a;
    private Double b;

    abstract public Double getResult();

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }
}
