package com.bat.strategy.entity;

import com.bat.strategy.strategy.Strategy;

import java.util.Collection;

/**
 * 收银机
 *
 * @author ZhengYu
 * @version 1.0 2020/4/25 10:30
 **/
public class Cashier {

    // 计算总价
    public double calculate(Collection<Product> products, Strategy strategy) {
        return strategy.calculateTotalPrice(products);
    }
}
