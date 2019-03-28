package com.bat.factory.factory;


import com.bat.factory.product.Product;
import com.bat.factory.product.ProductC;

public class FactoryC implements Factory {
    @Override
    public Product product() {
        return new ProductC();
    }
}
