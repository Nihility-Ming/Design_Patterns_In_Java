package com.miaoge.Strategy.CashStrategy;

/**
 * 价格策略抽象类
 */
public abstract class CashStrategy {

    public abstract Double acceptCash(Double price, Integer num);

}