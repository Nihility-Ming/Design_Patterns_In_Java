package com.miaoge.Bridge.Brand.Impl;

import com.miaoge.Bridge.Brand.Brand;

public class Samsung extends Brand {
    @Override
    public void run() {
        System.out.println("Samsung...");
        this.software.run();
    }
}
