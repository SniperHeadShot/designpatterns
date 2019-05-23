package com.bat.colleague;

import com.bat.mediator.Mediator;

/**
 * @ClassName ColleagueOne
 * @Description 具体同事类，每个同事只需要知道自己的行为，而不了解其他同事类的情况
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/22 23:23
 */
public class ColleagueOne extends Colleague {

    public ColleagueOne(Mediator mediator) {
        super(mediator);
    }

    /**
     * @Param [message]
     * @Return void
     * @Author ZhengYu
     * @Description: 发送消息时通常是中介者发出去的
     * @Date 23:31
     */
    public void send(String message) {
        mediator.send(message, this);
    }

    public void notify(String message) {
        System.out.println("同事1得到消息" + message);
    }
}
