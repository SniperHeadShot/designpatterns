package com.bat.observer.subject;

import com.bat.observer.observer.Observer;

/**
 * 主题
 *
 * @author ZhengYu
 * @version 1.0 2020/4/26 14:32
 **/
public interface Subject {

    // 发布主题
    void publishTopic(String msg);

    // 新增订阅
    void addObserver(Observer observer);

    // 取消订阅
    void delObserver(Observer observer);
}
