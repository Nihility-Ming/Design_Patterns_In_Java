package com.miaoge.Strategy.CashStrategy.Impl;

import com.miaoge.Strategy.CashStrategy.CashStrategy;

/**
 * 普通价格策略
 */
public class CashNormalStrategy extends CashStrategy {

    @Override
    public Double acceptCash(Double price, Integer num) {
        return price * num;
    }
}
