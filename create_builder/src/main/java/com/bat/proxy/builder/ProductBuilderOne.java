package com.bat.proxy.builder;

import com.bat.proxy.product.Product;
import com.bat.proxy.productpart.PartA;
import com.bat.proxy.productpart.PartB;
import com.bat.proxy.productpart.PartC;

public class ProductBuilderOne implements ProductBuilder{

    private Product product;

    public ProductBuilderOne() {
        product = new Product();
    }

    public void buildPartA() {
        product.setPartA(new PartA("ProductBuilderOne PartA"));
    }

    public void buildPartB() {
        product.setPartB(new PartB("ProductBuilderOne PartB"));
    }

    public void buildPartC() {
        product.setPartC(new PartC("ProductBuilderOne PartC"));
    }

    public Product getProduct() {
        return product;
    }
}
