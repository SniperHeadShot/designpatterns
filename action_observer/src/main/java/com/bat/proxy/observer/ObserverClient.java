package com.bat.proxy.observer;

/**
 * @ClassName ObserverClient
 * @Version: 1.0
 * @Description 观察者
 * @Author ZhengYu
 * @create: 2019/4/26
 **/
public class ObserverClient implements Observer {

    private String name;
    private String message;

    public ObserverClient(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }

    public void read() {
        System.out.println(name + " 收到推送消息：" + message);
    }
}
