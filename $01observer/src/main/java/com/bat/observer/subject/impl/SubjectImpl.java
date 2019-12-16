package com.bat.observer.subject.impl;

import com.bat.observer.observer.Observer;
import com.bat.observer.subject.Subject;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 主题实现类
 *
 * @author ZhengYu
 * @version 1.0 2019/12/16 20:08
 **/
public class SubjectImpl implements Subject {

    private List<Observer> observerList = new CopyOnWriteArrayList<>();

    /**
     * 发布主题
     *
     * @param topic 主题
     * @author ZhengYu
     */
    @Override
    public void publishTopic(String topic) {
        observerList.forEach(observer -> observer.update(topic));
    }

    /**
     * 添加观察者
     *
     * @param observer 具体的观察者
     * @author ZhengYu
     */
    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    /**
     * 删除观察者
     *
     * @param observer 具体的观察者
     * @author ZhengYu
     */
    @Override
    public void delObserver(Observer observer) {
        observerList.remove(observer);
    }
}
