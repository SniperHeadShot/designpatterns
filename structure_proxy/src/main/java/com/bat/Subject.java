package com.bat;

/**
 * @ClassName Subject
 * @Description 为 RealSubject 和 Proxy 提供相同的几口，这样可以在任何使用 RealSubject 的地方都可以使用 Proxy
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/27 9:23
 **/
public abstract class Subject {

    public abstract void request();
}
