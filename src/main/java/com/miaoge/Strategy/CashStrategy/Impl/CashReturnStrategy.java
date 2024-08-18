package com.miaoge.Strategy.CashStrategy.Impl;

import com.miaoge.Strategy.CashStrategy.CashStrategy;

/**
 * 满返价格策略
 */
public class CashReturnStrategy extends CashStrategy {
    private final Double man;
    private final Double jian;

    public CashReturnStrategy(Double man, Double jian) {
        this.man = man;
        this.jian = jian;
    }

    @Override
    public Double acceptCash(Double price, Integer num) {
        Double ret = price * num;
        if(ret>=man) {
            return ret - jian;
        }
        return ret;
    }
}
