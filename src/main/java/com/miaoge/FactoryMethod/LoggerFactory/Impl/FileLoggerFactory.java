package com.miaoge.FactoryMethod.LoggerFactory.Impl;

import com.miaoge.FactoryMethod.Logger.ILogger;
import com.miaoge.FactoryMethod.Logger.Impl.FileLogger;
import com.miaoge.FactoryMethod.LoggerFactory.LoggerFactory;

public class FileLoggerFactory extends LoggerFactory {
    @Override
    public ILogger createLogger() {
        ILogger logger = new FileLogger();
        return logger;
    }

    @Override
    public ILogger createLoggerWithArgs(String args) {
        ILogger logger = new FileLogger();
        // 配置参数
        return logger;
    }

    @Override
    public ILogger createLoggerWithObj(Object obj) {
        ILogger logger = new FileLogger();
        // 配置参数
        return logger;
    }


}
