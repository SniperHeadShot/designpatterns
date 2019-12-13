package com.bat.proxy;

import com.bat.proxy.env.StrategyContext;
import com.bat.proxy.strategy.StrategyTwo;

/**
 * @ClassName StrategyTestMain
 * @Version: 1.0
 * @Description
 * @Author ZhengYu
 * @create: 2019/4/15
 **/
public class StrategyTestMain {
    public static void main(String[] args) {
        //创建策略对象
        StrategyTwo strategyTwo = new StrategyTwo();
        //创建策略上下文对象并持有策略
        StrategyContext strategyContext = new StrategyContext(strategyTwo);
        //执行
        strategyContext.operate("Hello Word");
    }
}
