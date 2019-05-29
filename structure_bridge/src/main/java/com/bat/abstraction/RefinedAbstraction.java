package com.bat.abstraction;

/**
 * @ClassName RefinedAbstraction
 * @Description 抽象实现类
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/29 10:23
 **/
public class RefinedAbstraction extends Abstraction {

    @Override
    public void operation() {
        implementor.operation();
    }
}
