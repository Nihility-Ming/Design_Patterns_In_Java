package com.miaoge.ResponsibilityChain;

import com.miaoge.ResponsibilityChain.Superior.Superior;

public class Result {

    public static void printSuccessfulResult(Leave leave, Superior superior) {
        String str = String.format("姓名：%s    请假天数：%d      描述：%s    通过，处理人：%s",
                leave.getProposer(),
                leave.getDay(),
                leave.getContent(), superior);

        System.out.println(str);
    }

    public static void printUnsuccessfulResult(Leave leave) {
        String str = String.format("姓名：%s    请假天数：%d      描述：%s    审核失败，请假天数超过30天！",
                leave.getProposer(),
                leave.getDay(),
                leave.getContent());

        System.out.println(str);
    }
}
