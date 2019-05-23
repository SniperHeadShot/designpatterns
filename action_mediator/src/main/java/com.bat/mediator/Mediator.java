package com.bat.mediator;

import com.bat.colleague.Colleague;

/**
 * @ClassName Mediator
 * @Description 抽象中介者，定义了同事对象到中介者对象之间的接口
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/22 23:16
 */
public abstract class Mediator {

    public abstract void send(String message, Colleague colleague);

}
