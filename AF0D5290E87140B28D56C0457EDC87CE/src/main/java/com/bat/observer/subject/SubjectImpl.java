package com.bat.observer.subject;

import com.bat.observer.observer.Observer;
import lombok.Data;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 主题实现
 *
 * @author ZhengYu
 * @version 1.0 2020/4/26 14:36
 **/
@Data
public class SubjectImpl implements Subject {

    private static List<Observer> observers = new CopyOnWriteArrayList<>();

    @Override
    public void publishTopic(String msg) {
        observers.forEach(observer -> observer.receive(msg));
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void delObserver(Observer observer) {
        observers.remove(observer);
    }
}
