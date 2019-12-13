package com.bat.proxy.env;

import com.bat.proxy.strategy.IStrategy;

/**
 * @ClassName StrategyContext
 * @Version: 1.0
 * @Description 策略上下文
 * @Author ZhengYu
 * @create: 2019/4/15
 **/
public class StrategyContext {

    private IStrategy iStrategy;

    public StrategyContext(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    public void operate(String str) {
        iStrategy.doStrategy(str);
    }
}
