package com.bat.abstractfactory.factory;

import com.bat.abstractfactory.product.*;

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
