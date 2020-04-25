package com.bat.strategy;

import com.bat.strategy.entity.BaseProduct;
import com.bat.strategy.entity.Cashier;
import com.bat.strategy.entity.Product;
import com.bat.strategy.enums.ProductEnum;
import com.bat.strategy.strategy.DiscountStrategy;
import com.bat.strategy.strategy.NormalStrategy;
import com.bat.strategy.strategy.SpecialStrategy;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * 需求: 实现一个收银机，可以根据优惠调整计算方式
 *
 * @author ZhengYu
 * @version 1.0 2020/4/25 9:34
 **/
@Slf4j
public class StrategyClient {
    public static void main(String[] args) {
        // 收银机
        Cashier cashier = new Cashier();
        // 商品
        List<Product> products = buildProductList();

        // 需求1： 普通收银
        double normalResult = cashier.calculate(products, new NormalStrategy());
        System.out.println(String.format("普通收银结果:[%f]", normalResult));

        // 需求2： 八折优惠
        double disResult = cashier.calculate(products, new DiscountStrategy());
        System.out.println(String.format("八折优惠收银结果:[%f]", disResult));

        // 需求3： 3斤苹果送1L牛奶(不足1L不提醒, 超过1L额外计费)
        double specialResult = cashier.calculate(products, new SpecialStrategy());
        System.out.println(String.format("特殊策略收银结果:[%f]", specialResult));
    }

    // 生产商品
    private static List<Product> buildProductList() {
        return new ArrayList<Product>() {{
            add(new BaseProduct(ProductEnum.APPLE.getName(), 3.6, 3.88));
            add(new BaseProduct(ProductEnum.MILK.getName(), 1.0, 5.00));
            add(new BaseProduct(ProductEnum.MILK.getName(), 1.0, 5.00));
        }};
    }
}
