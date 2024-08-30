package com.miaoge.FactoryMethod.Logger.Impl;

import com.miaoge.FactoryMethod.Logger.ILogger;

public class FileLogger implements ILogger {
    @Override
    public void writeLog() {
        System.out.println("文件日志记录。");
    }
}
