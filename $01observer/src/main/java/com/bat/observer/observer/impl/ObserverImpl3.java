package com.bat.observer.observer.impl;

import com.bat.observer.observer.Observer;
import lombok.extern.slf4j.Slf4j;

/**
 * 具体的观察者
 *
 * @author ZhengYu
 * @version 1.0 2019/12/16 20:03
 **/
@Slf4j
public class ObserverImpl3 implements Observer {

    /**
     * 发布新主题时观察者进行相应的动作
     *
     * @param msg 参数
     * @author ZhengYu
     */
    @Override
    public void update(String msg) {
        log.info("我是三号观察者，我接收到主题 ==> [{}]", msg);
    }
}
