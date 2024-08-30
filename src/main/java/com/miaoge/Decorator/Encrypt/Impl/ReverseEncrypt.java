package com.miaoge.Decorator.Encrypt.Impl;

import com.miaoge.Decorator.Encrypt.Encrypt;

/**
 * 逆向输出加密
 */
public class ReverseEncrypt extends Encrypt {

    @Override
    public String encrypting() {
        String encryptingStr = super.encrypting();
        encryptingStr = reverseString(encryptingStr);
        System.out.printf("执行逆向输出加密运算: %s\n", encryptingStr);
        return encryptingStr;
    }

    private static String reverseString(String input) {
        StringBuilder reversedString = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedString.append(input.charAt(i));
        }
        return reversedString.toString();
    }

}
