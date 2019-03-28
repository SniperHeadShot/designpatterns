package com.bat.abstractfactory.factory;

import com.bat.abstractfactory.product.*;

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
