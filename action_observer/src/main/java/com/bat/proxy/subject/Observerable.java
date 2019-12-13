package com.bat.proxy.subject;

import com.bat.proxy.observer.Observer;

/**
 * @ClassName Observerable
 * @Version: 1.0
 * @Description 抽象被观察者接口
 * @Author ZhengYu
 * @create: 2019/4/26
 **/
public interface Observerable {

    /**
     * @描述 添加观察者
     * @创建人 ZhengYu
     * @创建时间 2019/4/26
     */
    void registerObserver(Observer observer);

    /**
     * @描述 移除观察者
     * @创建人 ZhengYu
     * @创建时间 2019/4/26
     */
    void removeObserver(Observer observer);

    /**
     * @描述 通知观察者
     * @创建人 ZhengYu
     * @创建时间 2019/4/26
     */
    void notifyObserver();
}
