package com.bat.proxy.abstractfactory.factory;

import com.bat.abstractfactory.product.*;
import com.bat.proxy.abstractfactory.product.ProductA;
import com.bat.proxy.abstractfactory.product.ProductA1;
import com.bat.proxy.abstractfactory.product.ProductB;
import com.bat.proxy.abstractfactory.product.ProductB1;

public class Factory1 implements Factory {

    @Override
    public ProductA productA() {
        return new ProductA1();
    }

    @Override
    public ProductB productB() {
        return new ProductB1();
    }
}
