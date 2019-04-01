package com.bat;

import com.bat.builder.ProductBuilderOne;
import com.bat.direct.Director;
import com.bat.product.Product;

public class BuilderTestMain {
    public static void main(String[] args) {
        Director director = new Director();
        Product product = director.buildProduct(new ProductBuilderOne());
        System.out.println(product);
    }
}
