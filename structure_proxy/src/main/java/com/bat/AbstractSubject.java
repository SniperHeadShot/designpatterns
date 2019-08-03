package com.bat;

/**
 * 为 RealAbstractSubject 和 Proxy 提供相同的接口，这样可以在任何使用 RealAbstractSubject 的地方都可以使用 Proxy
 *
 * @author ZhengYu
 * @version 1.0 2019/8/3 18:05
 **/
public abstract class AbstractSubject {

    /**
     * 接口功能
     *
     * @author ZhengYu
     */
    public abstract void request();
}
