package com.bat;

/**
 * 需要被代理的接口
 *
 * @author ZhengYu
 * @version 1.0 2019/8/3 18:05
 **/
public class SubjectInterfaceImpl implements SubjectInterface {

    @Override
    public void request() {
        System.out.println("function interface that needs to be proxied!");
    }
}
