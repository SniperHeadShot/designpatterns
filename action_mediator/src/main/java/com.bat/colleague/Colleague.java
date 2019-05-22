package com.bat.colleague;

import com.bat.mediator.Mediator;

/**
 * @ClassName Colleague
 * @Description 抽象同事类
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/22 23:17
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
