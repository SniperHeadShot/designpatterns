package com.bat.proxy;

/**
 * @ClassName ConcreteCommand
 * @Description TODO
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/20 9:27
 **/
public class ConcreteCommand extends Command {

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
