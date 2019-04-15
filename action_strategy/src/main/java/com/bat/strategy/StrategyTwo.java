package com.bat.strategy;

/**
 * @ClassName StrategyTwo
 * @Version: 1.0
 * @Description 具体策略实现
 * @Author ZhengYu
 * @create: 2019/4/15
 **/
public class StrategyTwo implements IStrategy {

    public void doStrategy(String str) {
        System.out.println("策略Two：" + str);
    }
}
