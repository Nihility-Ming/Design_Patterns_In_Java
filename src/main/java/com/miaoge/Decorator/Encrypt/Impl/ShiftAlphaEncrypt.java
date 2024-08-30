package com.miaoge.Decorator.Encrypt.Impl;

import com.miaoge.Decorator.Encrypt.Encrypt;

/**
 * 字母进行移位加密
 */
public class ShiftAlphaEncrypt extends Encrypt {
    @Override
    public String encrypting() {
        String encryptingStr = super.encrypting();
        encryptingStr = encrypt(encryptingStr, 3);
        System.out.printf("执行字母移位加密运算: %s\n", encryptingStr);
        return encryptingStr;
    }

    private static String encrypt(String input, Integer shift) {
        StringBuilder encryptedString = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                // 计算移位后的字符
                char shifted = (char) (((c - base + shift) % 26) + base);
                encryptedString.append(shifted);
            } else {
                // 非字母字符保持不变
                encryptedString.append(c);
            }
        }
        return encryptedString.toString();
    }
}
