package com.bat;

import com.bat.component.Component;
import com.bat.component.ConcreteComponent;
import com.bat.decorator.ConcreteDecoratorOne;
import com.bat.decorator.ConcreteDecoratorTwo;

/**
 * @ClassName DecoratorTestMain
 * @Description 装饰器模式测试主类
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/24 9:48
 **/
public class DecoratorTestMain {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();  // 客户端创建对象

        ConcreteDecoratorOne concreteDecoratorOne = new ConcreteDecoratorOne();
        concreteDecoratorOne.setComponent(component);   // 对客户端创建的对象进行装饰
        concreteDecoratorOne.operation();

        System.out.println("========================");

        ConcreteDecoratorTwo concreteDecoratorTwo = new ConcreteDecoratorTwo();
        concreteDecoratorTwo.setComponent(concreteDecoratorOne);    // 每个装饰器对象只关心自己的功能，不需要关心如何被添加到对象链当中
        concreteDecoratorTwo.operation();
    }
}
