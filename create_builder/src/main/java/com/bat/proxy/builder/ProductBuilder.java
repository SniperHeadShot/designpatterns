package com.bat.proxy.builder;

import com.bat.proxy.product.Product;

public interface ProductBuilder {

    void buildPartA();
    void buildPartB();
    void buildPartC();
    Product getProduct();
}
