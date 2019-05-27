package com.bat;

/**
 * @ClassName Proxy
 * @Description 代理类,保存一个引用使得代理可以访问实体，提供一个与 Subject 的接口相同的接口，这样代理就可以用来替换实体
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/27 9:25
 **/
public class Proxy extends Subject {

    private Subject subject;

    @Override
    public void request() {
        if(subject == null){
            subject = new RealSubject();
        }
        subject.request();
    }
}
