package com.bat.decorator;

import com.bat.decorator.decorator.DecoratorImplA;
import com.bat.decorator.decorator.DecoratorImplB;
import com.bat.decorator.old.OldInterface;
import com.bat.decorator.old.OldInterfaceImpl;

/**
 * 装饰器模式客户端
 * 需求: 现有业务接口
 *
 * @author ZhengYu
 * @version 1.0 2020/4/28 10:38
 **/
public class DecoratorClient {
    public static void main(String[] args) {
        // 需要被装饰的对象
        OldInterface old = new OldInterfaceImpl();

        // 装饰器A
        OldInterface decoratorA = new DecoratorImplA(old);
        decoratorA.doSomeThing();

        // 装饰器B
        OldInterface decoratorB = new DecoratorImplB(old);
        decoratorB.doSomeThing();
    }
}
