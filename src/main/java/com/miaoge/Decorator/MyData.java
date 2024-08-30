package com.miaoge.Decorator;

import com.miaoge.Decorator.Encrypt.IEncrypt;

public class MyData implements IEncrypt {

    public MyData(String data) {
        this.data = data;
    }

    private String data;

    @Override
    public String encrypting() {
        System.out.println(String.format("原始数据: %s", this.data));
        return this.data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
