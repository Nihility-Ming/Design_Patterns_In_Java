package com.miaoge.Bridge.Brand.Impl;

import com.miaoge.Bridge.Brand.Brand;

public class Nokia extends Brand {
    @Override
    public void run() {
        System.out.println("Nokia...");
        this.software.run();
    }
}
