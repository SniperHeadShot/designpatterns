package com.bat.observer.subject;

import com.bat.observer.observer.Observer;

/**
 * 主题类
 *
 * @author ZhengYu
 * @version 1.0 2019/12/16 20:06
 **/
public interface Subject {

    /**
     * 发布主题
     *
     * @param topic 主题
     * @author ZhengYu
     */
    void publishTopic(String topic);

    /**
     * 添加观察者
     *
     * @param observer 具体的观察者
     * @author ZhengYu
     */
    void addObserver(Observer observer);

    /**
     * 删除观察者
     *
     * @param observer 具体的观察者
     * @author ZhengYu
     */
    void delObserver(Observer observer);
}
