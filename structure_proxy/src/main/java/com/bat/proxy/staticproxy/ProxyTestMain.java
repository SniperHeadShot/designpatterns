package com.bat.proxy.staticproxy;

/**
 * 为其他对象提供一种代理以控制对这个对象的访问
 *
 * @author ZhengYu
 * @version 1.0 2019/8/3 18:05
 **/
public class ProxyTestMain {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();
    }
}
