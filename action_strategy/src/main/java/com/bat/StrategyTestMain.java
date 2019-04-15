package com.bat;

import com.bat.env.StrategyContext;
import com.bat.strategy.StrategyTwo;

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
