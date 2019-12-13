package com.bat.proxy.abstractfactory.factory;

import com.bat.proxy.abstractfactory.product.ProductA;
import com.bat.proxy.abstractfactory.product.ProductB;

public interface Factory {

    ProductA productA();
    ProductB productB();
}
