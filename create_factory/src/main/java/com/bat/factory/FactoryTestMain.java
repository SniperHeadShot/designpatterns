package com.bat.factory;

import com.bat.factory.factory.Factory;
import com.bat.factory.factory.FactoryB;
import com.bat.factory.product.Product;

public class FactoryTestMain {
    public static void main(String[] args) {
        Factory factory = new FactoryB();
        Product product = factory.product();
        System.out.println(product.productName());
    }
}
