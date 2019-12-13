package com.bat.proxy;

import com.bat.proxy.jdk.JDKClient;
import com.bat.proxy.jdk.WechatServer;
import com.bat.proxy.observer.Observer;
import com.bat.proxy.observer.ObserverClient;

/**
 * @ClassName ObserverTestMain
 * @Version: 1.0
 * @Description
 * @Author ZhengYu
 * @create: 2019/4/19
 **/
public class ObserverTestMain {
    public static void main(String[] args) {
        System.out.println("-- -- -- -手写观察者模式代码部分- -- -- --");
        WechatServer wechatServer = new WechatServer();

        Observer observer1 = new ObserverClient("刘备");
        Observer observer2 = new ObserverClient("关羽");
        Observer observer3 = new ObserverClient("张飞");

        wechatServer.registerObserver(observer1);
        wechatServer.registerObserver(observer2);
        wechatServer.registerObserver(observer3);

        wechatServer.broadcastInformation("Hello 观察者模式!");

        wechatServer.removeObserver(observer1);
        wechatServer.broadcastInformation("Hello 有人在接收吗?");
        System.out.println("-- -- -- -JDK自带观察者模式代码部分- -- -- --");
        WechatServer wechatServerJdk = new WechatServer();

        JDKClient observer1Jdk = new JDKClient("刘备");
        JDKClient observer2Jdk = new JDKClient("关羽");
        JDKClient observer3Jdk = new JDKClient("张飞");

        wechatServerJdk.addObserver(observer1Jdk);
        wechatServerJdk.addObserver(observer2Jdk);
        wechatServerJdk.addObserver(observer3Jdk);

        wechatServerJdk.setChanged();
        wechatServerJdk.notifyObservers("Hello JDK自带的观察者模式!");
        wechatServerJdk.clearChanged();
    }
}
