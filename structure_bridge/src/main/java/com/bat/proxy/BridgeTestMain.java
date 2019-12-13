package com.bat.proxy;

import com.bat.proxy.abstraction.Abstraction;
import com.bat.proxy.abstraction.RefinedAbstraction;
import com.bat.proxy.implementor.ConcreteImplementorA;
import com.bat.proxy.implementor.ConcreteImplementorB;

/**
 * @ClassName BridgeTestMain
 * @Description 将抽象部分与它的实现部分分离，使他们都可以独立地变化
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/29 9:12
 **/
public class BridgeTestMain {
    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstraction();

        abstraction.setImplementor(new ConcreteImplementorA());
        abstraction.operation();

        abstraction.setImplementor(new ConcreteImplementorB());
        abstraction.operation();
    }
}
