package com.bat.abstractfactory;

import com.bat.abstractfactory.factory.Factory;
import com.bat.abstractfactory.factory.Factory2;
import com.bat.abstractfactory.product.ProductA;
import com.bat.abstractfactory.product.ProductB;

public class TestMain {
    public static void main(String[] args) {
        Factory factory = new Factory2();
        ProductA productA = factory.productA();
        ProductB productB = factory.productB();
        System.out.println(productA.productName());
        System.out.println(productB.productName());
    }
}
