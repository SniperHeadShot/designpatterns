package com.bat.strategy.strategy;

import com.bat.strategy.entity.Product;
import com.bat.strategy.enums.ProductEnum;

import java.util.Collection;

/**
 * 特殊策略 3斤苹果送1L牛奶(不足1L不提醒, 超过1L额外计费)
 *
 * @author ZhengYu
 * @version 1.0 2020/4/25 10:59
 **/
public class SpecialStrategy implements Strategy {

    @Override
    public Double calculateTotalPrice(Collection<Product> products) {
        double appleCount = 0.00, milkCount = 0.00;

        // 计算苹果和牛奶的总数
        for (Product product : products) {
            if (ProductEnum.APPLE.getName().equals(product.name())) {
                appleCount += product.count();
            }
            if (ProductEnum.MILK.getName().equals(product.name())) {
                milkCount += product.count();
            }
        }

        // 苹果数大于3需要减去牛奶数量
        if (appleCount > 3 && milkCount > 0) {
            // 多余的数量减去
            double surplus = 1;
            for (Product product : products) {
                if (ProductEnum.MILK.getName().equals(product.name())) {
                    surplus = surplus - product.count();
                    if (surplus < 0) {
                        product.modifyCount(-surplus);
                        break;
                    } else {
                        product.modifyCount(0.0);
                    }
                }
            }
        }

        return normalCalculate(products).doubleValue();
    }
}
