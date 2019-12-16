package com.bat.observer;

import com.bat.observer.observer.Observer;
import com.bat.observer.observer.impl.ObserverImpl1;
import com.bat.observer.observer.impl.ObserverImpl2;
import com.bat.observer.observer.impl.ObserverImpl3;
import com.bat.observer.subject.Subject;
import com.bat.observer.subject.impl.SubjectImpl;

/**
 * Observer 观察者模式
 * <p>
 * 观察者模式（又被称为发布-订阅（Publish/Subscribe）模式，属于行为型模式的一种，它定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象
 * 这个主题对象在状态变化时，会通知所有的观察者对象，使他们能够自动更新自己
 *
 * @author ZhengYu
 * @version 1.0 2019/12/16 19:51
 **/
public class ObserverClient {
    public static void main(String[] args) {
        // 定义一个主题
        Subject subject = new SubjectImpl();

        // 定义具体的观察者并订阅主题
        Observer observer = new ObserverImpl1();
        subject.addObserver(observer);
        subject.addObserver(new ObserverImpl2());
        subject.addObserver(new ObserverImpl3());

        // 发布一个主题
        subject.publishTopic("hello observers");

        // 一号观察者取消订阅
        subject.delObserver(observer);

        // 再次发布一个主题
        subject.publishTopic("thanks");
    }
}
