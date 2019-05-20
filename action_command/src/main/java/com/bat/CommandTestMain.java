package com.bat;

/**
 * @ClassName CommandTestMain
 * @Description 命令模式测试主类
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/20 9:33
 **/
public class CommandTestMain {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.executeCommand();
        invoker.executeCommand();
    }
}
