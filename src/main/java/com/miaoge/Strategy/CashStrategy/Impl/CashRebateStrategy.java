package com.miaoge.Strategy.CashStrategy.Impl;

import com.miaoge.Strategy.CashStrategy.CashStrategy;

/**
 * 打折价格策略
 */
public class CashRebateStrategy extends CashStrategy {
    private Double rate = 1d;

    public CashRebateStrategy(Double rate) {
        this.rate = rate;
    }

    @Override
    public Double acceptCash(Double price, Integer num) {
        return price * num * rate;
    }
}
