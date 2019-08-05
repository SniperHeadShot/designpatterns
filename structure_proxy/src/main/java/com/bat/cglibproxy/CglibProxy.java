package com.bat.cglibproxy;

import lombok.extern.slf4j.Slf4j;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Cglib 动态代理
 *
 * @author ZhengYu
 * @version 1.0 2019/8/5 11:37
 **/
@Slf4j
public class CglibProxy implements MethodInterceptor {

    @Override
    public Object intercept(Object sub, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        log.info("do something before proxy!");
        Object returnValue = methodProxy.invokeSuper(sub, objects);
        log.info("do something after proxy!");
        return returnValue;
    }
}
