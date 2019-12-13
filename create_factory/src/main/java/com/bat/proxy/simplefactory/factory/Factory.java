package com.bat.proxy.simplefactory.factory;

import com.bat.proxy.simplefactory.product.Product;
import com.bat.proxy.simplefactory.product.ProductA;
import com.bat.proxy.simplefactory.product.ProductC;
import com.bat.proxy.simplefactory.product.ProductB;

public class Factory {
    public Product product(String productType) {
        switch (productType) {
            case "A":
                return new ProductA();
            case "B":
                return new ProductB();
            case "C":
                return new ProductC();
            default:
                return null;
        }
    }
}
