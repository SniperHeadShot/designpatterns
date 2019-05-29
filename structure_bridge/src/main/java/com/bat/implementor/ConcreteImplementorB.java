package com.bat.implementor;

/**
 * @ClassName ConcreteImplementorA
 * @Description 派生类
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/29 9:55
 **/
public class ConcreteImplementorB extends Implementor {

    /**
     * @Param []
     * @Return void
     * @Author ZhengYu
     * @Description: 逻辑具体实现接口
     * @Date 2019/5/29
     */
    @Override
    public void operation() {
        System.out.println("ConcreteImplementorB ... operation()");
    }
}
