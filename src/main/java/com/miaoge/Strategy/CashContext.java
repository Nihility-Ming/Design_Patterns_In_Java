package com.miaoge.Strategy;

import com.miaoge.Strategy.CashStrategy.CashStrategy;
import com.miaoge.Strategy.CashStrategy.Impl.CashNormalStrategy;
import com.miaoge.Strategy.CashStrategy.Impl.CashRebateStrategy;
import com.miaoge.Strategy.CashStrategy.Impl.CashReturnStrategy;

/**
 * 策略模式（Strategy）：它定义了算法家族，分别封装起来，让它们
 * 之间可以互相替换，此模式让算法的变化，不会影响到使用算法的客户。
 */
public class CashContext {

    private CashStrategy cashStrategy;

    public CashContext(Integer cashType) {
        switch (cashType) {
            case 1:
                this.cashStrategy = new CashNormalStrategy();
                break;
            case 2:
                this.cashStrategy = new CashRebateStrategy(0.8d);
                break;
            case 3:
                this.cashStrategy = new CashRebateStrategy(0.7d);
                break;
            case 4:
                this.cashStrategy = new CashReturnStrategy(300d, 100d);
                break;
        }
    }

    public double getResult(Double price, Integer num) {
        return this.cashStrategy.acceptCash(price, num);
    }
}
