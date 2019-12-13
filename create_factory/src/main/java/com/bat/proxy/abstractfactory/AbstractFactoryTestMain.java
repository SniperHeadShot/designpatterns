package com.bat.proxy.abstractfactory;

import com.bat.proxy.abstractfactory.factory.Factory;
import com.bat.proxy.abstractfactory.factory.Factory2;
import com.bat.proxy.abstractfactory.product.ProductA;
import com.bat.proxy.abstractfactory.product.ProductB;

public class AbstractFactoryTestMain {
    public static void main(String[] args) {
        Factory factory = new Factory2();
        ProductA productA = factory.productA();
        ProductB productB = factory.productB();
        System.out.println(productA.productName());
        System.out.println(productB.productName());
    }
}
