package com.miaoge.Decorator.Encrypt.Impl;

import com.miaoge.Decorator.Encrypt.Encrypt;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5加密
 */
public class MD5Encrypt extends Encrypt {

    @Override
    public String encrypting() {
        String encryptingStr = super.encrypting();
        encryptingStr = md5(encryptingStr);
        System.out.printf("执行MD5加密运算: %s\n", encryptingStr);
        return encryptingStr;
    }

    private static String toHexString(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }

    private static String md5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            return toHexString(messageDigest);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
