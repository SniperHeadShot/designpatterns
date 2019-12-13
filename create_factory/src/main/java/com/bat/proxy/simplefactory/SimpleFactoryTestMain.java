package com.bat.proxy.simplefactory;

import com.bat.proxy.simplefactory.product.Product;
import com.bat.proxy.simplefactory.factory.Factory;

public class SimpleFactoryTestMain {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Product product = factory.product("B");
        System.out.println(product.productName());
    }
}
