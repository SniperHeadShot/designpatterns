package com.bat.builder;

import com.bat.product.Product;

public interface ProductBuilder {

    void buildPartA();
    void buildPartB();
    void buildPartC();
    Product getProduct();
}
