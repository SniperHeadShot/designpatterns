package com.bat.decorator.old;

/**
 * 旧的业务接口的实现
 *
 * @author ZhengYu
 * @version 1.0 2020/4/28 10:45
 **/
public class OldInterfaceImpl implements OldInterface{

    @Override
    public void doSomeThing() {
        System.out.println("旧的业务接口的实现");
    }
}
