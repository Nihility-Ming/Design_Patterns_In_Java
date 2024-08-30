package com.miaoge.Decorator.Encrypt;

public class Encrypt implements IEncrypt {

    public IEncrypt encrypt;

    @Override
     public String encrypting() {
        if (encrypt != null) {
            return encrypt.encrypting();
        }
        return null;
    }

    public IEncrypt getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(IEncrypt encrypt) {
        this.encrypt = encrypt;
    }


}
