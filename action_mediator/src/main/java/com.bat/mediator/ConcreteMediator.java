package com.bat.mediator;

import com.bat.colleague.Colleague;
import com.bat.colleague.ColleagueOne;
import com.bat.colleague.ColleagueTwo;

/**
 * @ClassName ConcreteMediator
 * @Description 具体中介者类，需要知道所有具体同事类，并从具体同事接收消息，向具体同事发出命令
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/22 23:20
 */
public class ConcreteMediator extends Mediator {

    private ColleagueOne colleagueOne;

    private ColleagueTwo colleagueTwo;

    public void setColleagueOne(ColleagueOne colleagueOne) {
        this.colleagueOne = colleagueOne;
    }

    public void setColleagueTwo(ColleagueTwo colleagueTwo) {
        this.colleagueTwo = colleagueTwo;
    }

    /**
     * @Param [message, colleague]
     * @Return void
     * @Author ZhengYu
     * @Description: 重写发送信息的方法，根据对象做出选择判断,通知对象
     * @Date 23:28
     */
    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == colleagueOne) {
            colleagueTwo.notify(message);
        } else {
            colleagueOne.notify(message);
        }
    }
}
