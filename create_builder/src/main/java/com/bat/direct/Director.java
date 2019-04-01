package com.bat.direct;

import com.bat.builder.ProductBuilder;
import com.bat.product.Product;

public class Director {

    public Product buildProduct(ProductBuilder productBuilder) {
        productBuilder.buildPartA();
        productBuilder.buildPartB();
        productBuilder.buildPartC();
        return productBuilder.getProduct();
    }

}
