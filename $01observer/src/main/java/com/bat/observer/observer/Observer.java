package com.bat.observer.observer;

/**
 * 创建 Observer 类
 *
 * @author ZhengYu
 * @version 1.0 2019/12/16 19:54
 **/
public interface Observer {

    /**
     * 发布新主题时观察者进行相应的动作
     *
     * @param msg 参数
     * @author ZhengYu
     */
    void update(String msg);
}
