package com.bat.proxy.subject;

import com.bat.proxy.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName WechatServer
 * @Version: 1.0
 * @Description
 * @Author ZhengYu
 * @create: 2019/4/26
 **/
public class WechatServer implements Observerable {

    private List<Observer> list;
    private String message;

    public WechatServer() {
        list = new ArrayList<>();
    }

    /**
     * @描述 添加观察者
     * @创建人 ZhengYu
     * @创建时间 2019/4/26
     */
    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    /**
     * @描述 移除观察者
     * @创建人 ZhengYu
     * @创建时间 2019/4/26
     */
    @Override
    public void removeObserver(Observer observer) {
        if (!list.isEmpty()) {
            list.remove(observer);
        }
    }

    /**
     * @创建人 ZhengYu
     * @创建时间 2019/4/26
     */
    @Override
    public void notifyObserver() {
        for (Observer observerSingle : list) {
            observerSingle.update(message);
        }
    }

    /**
     * @描述 广播消息
     * @创建人 ZhengYu
     * @创建时间 2019/4/26
     */
    public void broadcastInformation(String message) {
        this.message = message;
        System.out.println("微信服务更新消息： " + message);
        //消息更新，通知所有观察者
        notifyObserver();
    }
}
