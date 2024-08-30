package com.miaoge.FactoryMethod;

import com.miaoge.FactoryMethod.Logger.ILogger;
import com.miaoge.FactoryMethod.LoggerFactory.Impl.FileLoggerFactory;
import com.miaoge.FactoryMethod.LoggerFactory.LoggerFactory;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LoggerFactory factory = new FileLoggerFactory();
        factory.writeLog(); // 工厂方法的隐藏

        ILogger logger = factory.createLogger();
        ILogger logger1 = factory.createLoggerWithArgs(Arrays.toString(args));
        logger.writeLog();
        logger1.writeLog();
    }
}
