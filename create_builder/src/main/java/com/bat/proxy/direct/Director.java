package com.bat.proxy.direct;

import com.bat.proxy.product.Product;
import com.bat.proxy.builder.ProductBuilder;

public class Director {

    public Product buildProduct(ProductBuilder productBuilder) {
        productBuilder.buildPartA();
        productBuilder.buildPartB();
        productBuilder.buildPartC();
        return productBuilder.getProduct();
    }

}
