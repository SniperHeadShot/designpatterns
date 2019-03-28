package com.bat.abstractfactory.factory;

import com.bat.abstractfactory.product.ProductA;
import com.bat.abstractfactory.product.ProductB;

public interface Factory {

    ProductA productA();
    ProductB productB();
}
