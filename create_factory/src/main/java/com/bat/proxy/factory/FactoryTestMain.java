package com.bat.proxy.factory;

import com.bat.proxy.factory.factory.Factory;
import com.bat.proxy.factory.factory.FactoryB;
import com.bat.proxy.factory.product.Product;

public class FactoryTestMain {
    public static void main(String[] args) {
        Factory factory = new FactoryB();
        Product product = factory.product();
        System.out.println(product.productName());
    }
}
