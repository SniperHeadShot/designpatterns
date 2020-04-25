package com.bat.strategy.entity;

import lombok.Data;

/**
 * 抽象的商品类, 定义通用的商品
 *
 * @author ZhengYu
 * @version 1.0 2020/4/25 10:00
 **/
@Data
public class BaseProduct implements Product {

    // 商品名称
    private String productName;

    // 商品数量
    private Double count;

    // 商品单价
    private Double unitPrice;

    public BaseProduct() {
    }

    public BaseProduct(String productName, Double count, Double unitPrice) {
        this.productName = productName;
        this.count = count;
        this.unitPrice = unitPrice;
    }

    @Override
    public String name() {
        return productName;
    }

    @Override
    public Double count() {
        return count;
    }

    @Override
    public Double unitPrice() {
        return unitPrice;
    }

    @Override
    public boolean modifyCount(Double count) {
        if (count == null) {
            return false;
        }
        this.count = count;
        return true;
    }

    @Override
    public boolean modifyUnitPrice(Double unitPrice) {
        if (unitPrice == null) {
            return false;
        }
        this.unitPrice = unitPrice;
        return true;
    }
}
