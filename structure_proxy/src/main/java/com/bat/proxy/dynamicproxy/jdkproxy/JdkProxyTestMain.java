package com.bat.proxy.dynamicproxy.jdkproxy;

import com.bat.proxy.SubjectInterface;
import com.bat.proxy.SubjectInterfaceImpl;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Proxy;

/**
 * JDK 动态代理 测试类
 *
 * @author ZhengYu
 * @version 1.0 2019/8/5 9:19
 **/
@Slf4j
public class JdkProxyTestMain {
    public static void main(String[] args) {
        SubjectInterface target = new SubjectInterfaceImpl();
        JdkProxy handler = new JdkProxy(target);
        SubjectInterface proxyObj = (SubjectInterface) Proxy.newProxyInstance(JdkProxyTestMain.class.getClassLoader(), target.getClass().getInterfaces(), handler);
        proxyObj.request();
        System.out.println(proxyObj.introduction("SniperHeadShot"));
    }
}
