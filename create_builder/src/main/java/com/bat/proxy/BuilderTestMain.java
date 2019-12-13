package com.bat.proxy;

import com.bat.proxy.builder.ProductBuilderOne;
import com.bat.proxy.direct.Director;
import com.bat.proxy.product.Product;

public class BuilderTestMain {
    public static void main(String[] args) {
        Director director = new Director();
        Product product = director.buildProduct(new ProductBuilderOne());
        System.out.println(product);
    }
}
