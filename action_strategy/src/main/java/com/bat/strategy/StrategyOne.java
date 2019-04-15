package com.bat.strategy;

/**
 * @ClassName StrategyOne
 * @Version: 1.0
 * @Description 具体策略实现
 * @Author ZhengYu
 * @create: 2019/4/15
 **/
public class StrategyOne implements IStrategy {

    public void doStrategy(String str) {
        System.out.println("策略One：" + str);
    }
}
