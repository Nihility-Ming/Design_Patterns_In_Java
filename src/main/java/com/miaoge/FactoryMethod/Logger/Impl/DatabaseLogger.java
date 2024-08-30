package com.miaoge.FactoryMethod.Logger.Impl;

import com.miaoge.FactoryMethod.Logger.ILogger;

public class DatabaseLogger implements ILogger {
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录。");
    }
}
