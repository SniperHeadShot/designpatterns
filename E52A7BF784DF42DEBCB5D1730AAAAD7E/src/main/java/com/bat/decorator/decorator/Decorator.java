package com.bat.decorator.decorator;

import com.bat.decorator.old.OldInterface;

/**
 * 装饰器类
 *
 * @author ZhengYu
 * @version 1.0 2020/4/28 10:41
 **/
public abstract class Decorator implements OldInterface {

    private OldInterface oldInterface;

    public Decorator(OldInterface oldInterface) {
        this.oldInterface = oldInterface;
    }

    @Override
    public void doSomeThing() {
        oldInterface.doSomeThing();
    }
}
