package com.bat;

import com.bat.observer.Observer;
import com.bat.observer.ObserverClient;
import com.bat.subject.WechatServer;

/**
 * @ClassName ObserverTestMain
 * @Version: 1.0
 * @Description
 * @Author ZhengYu
 * @create: 2019/4/19
 **/
public class ObserverTestMain {
    public static void main(String[] args) {
        WechatServer wechatServer = new WechatServer();

        Observer observer1 = new ObserverClient("刘备");
        Observer observer2 = new ObserverClient("关羽");
        Observer observer3 = new ObserverClient("张飞");

        wechatServer.registerObserver(observer1);
        wechatServer.registerObserver(observer2);
        wechatServer.registerObserver(observer3);

        wechatServer.broadcastInformation("Hello 观察者模式!");

        System.out.println("-- -- -- -- -- -- --");

        wechatServer.removeObserver(observer1);
        wechatServer.broadcastInformation("Hello 有人在接收吗?");
    }
}
