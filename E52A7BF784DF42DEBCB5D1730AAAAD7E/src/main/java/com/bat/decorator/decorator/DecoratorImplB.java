package com.bat.decorator.decorator;

import com.bat.decorator.old.OldInterface;

/**
 * Decorator A实现
 *
 * @author ZhengYu
 * @version 1.0 2020/4/28 10:43
 **/
public class DecoratorImplB extends Decorator {

    public DecoratorImplB(OldInterface oldInterface) {
        super(oldInterface);
    }

    @Override
    public void doSomeThing() {
        super.doSomeThing();
        System.out.println("B装饰器进行了扩展功能");
    }
}
