package com.bat.proxy.factory.factory;


import com.bat.proxy.factory.product.Product;
import com.bat.proxy.factory.product.ProductC;

public class FactoryC implements Factory {
    @Override
    public Product product() {
        return new ProductC();
    }
}
