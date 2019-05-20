package com.bat;

/**
 * @ClassName Invoker
 * @Description 要求该命令执行这个请求
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/20 9:30
 **/
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
