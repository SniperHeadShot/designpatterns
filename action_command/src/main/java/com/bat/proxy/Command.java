package com.bat.proxy;

/**
 * @ClassName Command
 * @Description 申明用来执行操作的接口
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/20 9:25
 **/
public abstract class Command {

    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
