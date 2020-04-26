package com.bat.observer;

import com.bat.observer.observer.Observer;
import com.bat.observer.observer.ObserverImpl;
import com.bat.observer.subject.Subject;
import com.bat.observer.subject.SubjectImpl;

/**
 * 需求: 实现一个微信公众号推送功能
 *
 * @author ZhengYu
 * @version 1.0 2020/4/26 13:50
 **/
public class ObserverClient {
    public static void main(String[] args) {
        // 定义一个主题
        Subject subject = new SubjectImpl();

        // 定义三个用户并订阅主题
        Observer observer1 = new ObserverImpl("张三");
        subject.addObserver(observer1);
        Observer observer2 = new ObserverImpl("李四");
        subject.addObserver(observer2);
        Observer observer3 = new ObserverImpl("王五");
        subject.addObserver(observer3);

        // 发布一个消息
        subject.publishTopic("Hello Observer");

        // 张三取消订阅
        subject.delObserver(observer1);

        // 重新发布消息
        subject.publishTopic("Thanks");
    }
}
