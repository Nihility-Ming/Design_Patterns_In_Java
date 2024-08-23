package com.miaoge.Templete;

import com.miaoge.Templete.Paper.Impl.BWMPaper;
import com.miaoge.Templete.Paper.Impl.HASPaper;
import com.miaoge.Templete.Paper.TestPaper;

public class Main {
    public static void main(String[] args) {
        TestPaper testPaper = new BWMPaper();
        testPaper.test1();
        testPaper.test2();

        testPaper = new HASPaper();
        testPaper.test1();
        testPaper.test2();
    }
}
