package com.bat;

/**
 * @ClassName ProxyTestMain
 * @Description 为其他对象提供一种代理以控制对这个对象的访问
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/27 9:21
 **/
public class ProxyTestMain {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();
    }
}
