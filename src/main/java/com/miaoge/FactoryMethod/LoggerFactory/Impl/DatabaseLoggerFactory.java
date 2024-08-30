package com.miaoge.FactoryMethod.LoggerFactory.Impl;

import com.miaoge.FactoryMethod.Logger.ILogger;
import com.miaoge.FactoryMethod.Logger.Impl.DatabaseLogger;
import com.miaoge.FactoryMethod.LoggerFactory.LoggerFactory;

public class DatabaseLoggerFactory extends LoggerFactory {
    @Override
    public ILogger createLogger() {
        ILogger logger = new DatabaseLogger();
        return logger;
    }

    @Override
    public ILogger createLoggerWithArgs(String args) {
        ILogger logger = new DatabaseLogger();
        // 配置参数
        return logger;
    }

    @Override
    public ILogger createLoggerWithObj(Object obj) {
        ILogger logger = new DatabaseLogger();
        // 配置参数
        return logger;
    }

}
