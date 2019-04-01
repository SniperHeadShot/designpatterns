package com.bat.builder;

import com.bat.product.Product;
import com.bat.productpart.PartA;
import com.bat.productpart.PartB;
import com.bat.productpart.PartC;

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
