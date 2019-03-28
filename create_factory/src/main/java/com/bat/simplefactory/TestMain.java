package com.bat.simplefactory;

import com.bat.simplefactory.factory.Factory;
import com.bat.simplefactory.product.Product;

public class TestMain {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Product product = factory.product("B");
        System.out.println(product.productName());
    }
}
