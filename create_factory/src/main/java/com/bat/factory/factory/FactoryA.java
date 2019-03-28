package com.bat.factory.factory;


import com.bat.factory.product.Product;
import com.bat.factory.product.ProductA;

public class FactoryA implements Factory {
    @Override
    public Product product() {
        return new ProductA();
    }
}
