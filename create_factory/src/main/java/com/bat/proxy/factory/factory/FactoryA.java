package com.bat.proxy.factory.factory;


import com.bat.proxy.factory.product.Product;
import com.bat.proxy.factory.product.ProductA;

public class FactoryA implements Factory {
    @Override
    public Product product() {
        return new ProductA();
    }
}
