package com.miaoge.Decorator;

import com.miaoge.Decorator.Encrypt.Encrypt;
import com.miaoge.Decorator.Encrypt.Impl.MD5Encrypt;
import com.miaoge.Decorator.Encrypt.Impl.ReverseEncrypt;
import com.miaoge.Decorator.Encrypt.Impl.ShiftAlphaEncrypt;

public class Main {
    public static void main(String[] args) {

        MyData myData = new MyData("9jkmfsaf");

        Encrypt encrypt1 = new ShiftAlphaEncrypt();
        Encrypt encrypt2 = new ReverseEncrypt();
        Encrypt encrypt3 = new MD5Encrypt();

        encrypt1.setEncrypt(myData);
        encrypt2.setEncrypt(encrypt1);
        encrypt3.setEncrypt(encrypt2);

        String encrypting = encrypt3.encrypting();
        System.out.println("最终结果: " + encrypting);
    }
}
