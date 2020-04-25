package com.bat.strategy.entity;

/**
 * 商品类
 *
 * @author ZhengYu
 * @version 1.0 2020/4/25 9:39
 **/
public interface Product {

    // 获取商品名称
    String name();

    // 获取商品数量
    Double count();

    // 商品单价
    Double unitPrice();

    // 修改数量
    boolean modifyCount(Double count);

    // 修改单价
    boolean modifyUnitPrice(Double unitPrice);
}
