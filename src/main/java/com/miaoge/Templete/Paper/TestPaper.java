package com.miaoge.Templete.Paper;

public abstract class TestPaper {

    protected abstract String test1Answer();
    protected abstract String test2Answer();

    public void test1() {
        System.out.println("1.演奏笛子时，用手分别按住不同的笛孔，改变振动的空气柱的长度，从而改变了声音的");
        System.out.println(test1Answer());
    }

    public void test2() {
        System.out.println("2.雨后的街道上有些积水，到了夜晚背着灯光行走，则看到");
        System.out.println(test2Answer());
    }
}
