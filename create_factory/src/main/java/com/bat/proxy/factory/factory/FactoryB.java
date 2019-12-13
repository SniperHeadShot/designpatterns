package com.bat.proxy.factory.factory;


import com.bat.proxy.factory.product.Product;
import com.bat.proxy.factory.product.ProductB;

public class FactoryB implements Factory {
    @Override
    public Product product() {
        return new ProductB();
    }
}
