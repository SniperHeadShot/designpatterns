package com.bat.proxy;

/**
 * @ClassName Handler
 * @Description 定义一个责任链的处理接口
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/18 16:15
 **/
public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(int request);
}
