package com.bat.observer.observer;

/**
 * 观察者
 *
 * @author ZhengYu
 * @version 1.0 2020/4/26 14:29
 **/
public class ObserverImpl implements Observer {

    private String name;

    public ObserverImpl(String name) {
        this.name = name;
    }

    @Override
    public void receive(String msg) {
        System.out.println(String.format("用户[%s]接收到消息[%s]", name, msg));
    }
}
