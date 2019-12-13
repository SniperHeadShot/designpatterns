package com.bat.proxy.dynamicproxy.cglibproxy;

import com.bat.proxy.SubjectInterfaceImpl;
import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

/**
 * Cglib 动态代理 测试类
 *
 * @author ZhengYu
 * @version 1.0 2019/8/5 11:41
 **/
public class CglibProxyTestMain {
    public static void main(String[] args) {
        // 代理类class文件存入本地磁盘方便我们反编译查看源码
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\code");

        // 通过 CGLIB 动态代理获取代理对象的过程
        Enhancer enhancer = new Enhancer();
        // 设置 enhancer 对象的父类
        enhancer.setSuperclass(SubjectInterfaceImpl.class);
        // 设置 enhancer 的回调对象
        enhancer.setCallback(new CglibProxy());

        // 创建代理对象
        SubjectInterfaceImpl subjectInterface = (SubjectInterfaceImpl) enhancer.create();
        subjectInterface.request();
    }
}
