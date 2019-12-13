package com.bat.proxy.abstraction;

import com.bat.proxy.implementor.Implementor;

/**
 * @ClassName Abstraction
 * @Description 抽象
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/29 10:22
 **/
public class Abstraction {

    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation(){
        implementor.operation();
    }
}
