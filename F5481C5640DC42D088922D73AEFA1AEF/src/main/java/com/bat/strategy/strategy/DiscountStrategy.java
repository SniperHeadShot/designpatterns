package com.bat.strategy.strategy;

import com.bat.strategy.entity.Product;

import java.math.BigDecimal;
import java.util.Collection;

/**
 * 折扣策略
 *
 * @author ZhengYu
 * @version 1.0 2020/4/25 10:47
 **/
public class DiscountStrategy implements Strategy {

    private static final Double DEFAULT_DISCOUNT = 0.8;

    private Double discount;

    public DiscountStrategy() {
        discount = DEFAULT_DISCOUNT;
    }

    public DiscountStrategy(Double discount) {
        this.discount = discount;
    }

    @Override
    public Double calculateTotalPrice(Collection<Product> products) {
        BigDecimal dis = new BigDecimal(discount);
        BigDecimal normalResult = normalCalculate(products);
        return normalResult.multiply(dis).doubleValue();
    }
}
