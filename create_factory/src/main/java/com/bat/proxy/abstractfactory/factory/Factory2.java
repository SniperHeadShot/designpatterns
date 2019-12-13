package com.bat.proxy.abstractfactory.factory;

import com.bat.abstractfactory.product.*;
import com.bat.proxy.abstractfactory.product.ProductA;
import com.bat.proxy.abstractfactory.product.ProductB;
import com.bat.proxy.abstractfactory.product.ProductA2;
import com.bat.proxy.abstractfactory.product.ProductB2;

public class Factory2 implements Factory {

    @Override
    public ProductA productA() {
        return new ProductA2();
    }

    @Override
    public ProductB productB() {
        return new ProductB2();
    }
}
