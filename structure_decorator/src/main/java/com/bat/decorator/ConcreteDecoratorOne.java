package com.bat.decorator;

/**
 * @ClassName ConcreteDecoratorOne
 * @Description 具体的装饰对象，起到给 Component 添加职责的功能
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/24 9:51
 **/
public class ConcreteDecoratorOne extends Decorator {

    /**
     * @Param []
     * @Return void
     * @Author ZhengYu
     * @Description: 装饰 Component 的 operation 方法
     * @Date 2019/5/24
     */
    @Override
    public void operation() {
        System.out.println("ConcreteDecoratorOne 做一些扩展的装饰动作!");
        super.operation();
    }
}
