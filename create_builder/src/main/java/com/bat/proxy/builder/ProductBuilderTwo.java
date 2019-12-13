package com.bat.proxy.builder;

import com.bat.proxy.product.Product;
import com.bat.proxy.productpart.PartA;
import com.bat.proxy.productpart.PartB;
import com.bat.proxy.productpart.PartC;

public class ProductBuilderTwo implements ProductBuilder{

    private Product product;

    public ProductBuilderTwo() {
        product = new Product();
    }

    public void buildPartA() {
        product.setPartA(new PartA("ProductBuilderTwo PartA"));
    }

    public void buildPartB() {
        product.setPartB(new PartB("ProductBuilderTwo PartB"));
    }

    public void buildPartC() {
        product.setPartC(new PartC("ProductBuilderTwo PartC"));
    }

    public Product getProduct() {
        return product;
    }
}
