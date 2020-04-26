package com.bat.observer.observer;

/**
 * 观察者
 *
 * @author ZhengYu
 * @version 1.0 2020/4/26 14:29
 **/
public interface Observer {

    // 接收主题并作出响应
    void receive(String msg);
}
