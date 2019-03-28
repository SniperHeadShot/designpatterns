package com.bat.factory.factory;


import com.bat.factory.product.Product;
import com.bat.factory.product.ProductB;

public class FactoryB implements Factory {
    @Override
    public Product product() {
        return new ProductB();
    }
}
