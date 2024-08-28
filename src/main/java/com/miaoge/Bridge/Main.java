package com.miaoge.Bridge;

import com.miaoge.Bridge.Brand.Brand;
import com.miaoge.Bridge.Brand.Impl.Nokia;
import com.miaoge.Bridge.Brand.Impl.Samsung;
import com.miaoge.Bridge.Software.Impl.QQMusic;
import com.miaoge.Bridge.Software.Impl.QQZone;
import com.miaoge.Bridge.Software.Software;

public class Main {
    public static void main(String[] args) {
        Software soft_QQMusic = new QQMusic();
        Software soft_QQZone = new QQZone();

        Brand brand_Samsung = new Samsung();
        Brand brand_Nokia = new Nokia();

        brand_Samsung.software = soft_QQMusic;
        brand_Samsung.run();

        System.out.println("---------------------------------");

        brand_Nokia.software = soft_QQZone;
        brand_Nokia.run();
    }
}
