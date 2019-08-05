package com.bat.jdkproxy;

import com.bat.AbstractSubject;
import com.bat.RealAbstractSubject;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Proxy;

/**
 * JDK动态代理 测试类
 *
 * @author ZhengYu
 * @version 1.0 2019/8/5 9:19
 **/
@Slf4j
public class JdkProxyTestMain {
    public static void main(String[] args) {
        AbstractSubject target = new RealAbstractSubject();
        JdkProxy handler = new JdkProxy(target);
        AbstractSubject jdkProxy = (AbstractSubject) Proxy.newProxyInstance(JdkProxyTestMain.class.getClassLoader(), target.getClass().getInterfaces(), handler);
        jdkProxy.request();
    }
}
