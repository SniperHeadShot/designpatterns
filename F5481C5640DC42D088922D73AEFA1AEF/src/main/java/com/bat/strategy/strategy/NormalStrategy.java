package com.bat.strategy.strategy;

import com.bat.strategy.entity.Product;

import java.util.Collection;

/**
 * 普通计价方式
 *
 * @author ZhengYu
 * @version 1.0 2020/4/25 10:14
 **/
public class NormalStrategy implements Strategy {

    @Override
    public Double calculateTotalPrice(Collection<Product> products) {
        return normalCalculate(products).doubleValue();
    }
}
