package com.bat.proxy.dynamicproxy.jdkproxy;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * JDK 动态代理
 *
 * @author ZhengYu
 * @version 1.0 2019/8/3 18:05
 **/
@Slf4j
public class JdkProxy implements InvocationHandler {
    // 参考 https://www.jianshu.com/p/269afd0a52e6

    private Object target;

    public JdkProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("do something before proxy!");
        Object returnValue = method.invoke(target, args);
        log.info("do something after proxy!");
        return returnValue;
    }
}
