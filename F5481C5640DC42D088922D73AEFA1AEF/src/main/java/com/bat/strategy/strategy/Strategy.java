package com.bat.strategy.strategy;

import com.bat.strategy.entity.Product;

import java.math.BigDecimal;
import java.util.Collection;

/**
 * 商品策略
 *
 * @author ZhengYu
 * @version 1.0 2020/4/25 9:50
 **/
public interface Strategy {

    Double calculateTotalPrice(Collection<Product> products);

    // 普通的计算总数方法
    default BigDecimal normalCalculate(Collection<Product> products) {
        BigDecimal total = new BigDecimal(0);

        for (Product product : products) {
            BigDecimal count = new BigDecimal(product.count());
            BigDecimal unitPrice = new BigDecimal(product.unitPrice());
            BigDecimal mulPrice = count.multiply(unitPrice);
            total = total.add(mulPrice);
        }
        return total;
    }
}
