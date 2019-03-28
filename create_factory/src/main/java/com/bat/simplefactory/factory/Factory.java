package com.bat.simplefactory.factory;

import com.bat.simplefactory.product.Product;
import com.bat.simplefactory.product.ProductA;
import com.bat.simplefactory.product.ProductB;
import com.bat.simplefactory.product.ProductC;

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
