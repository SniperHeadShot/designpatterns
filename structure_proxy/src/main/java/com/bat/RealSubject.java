package com.bat;

/**
 * @ClassName RealSubject
 * @Description 定义 Proxy 所代表的真实实体
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/27 9:23
 **/
public class RealSubject extends Subject {

    @Override
    public void request() {
        System.out.println("真实的请求!");
    }
}
