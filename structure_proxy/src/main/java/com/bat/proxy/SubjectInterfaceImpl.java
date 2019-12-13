package com.bat.proxy;

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

    /**
     * 参数返回值
     *
     * @param name 参数
     * @return java.lang.String
     * @author ZhengYu
     */
    @Override
    public String introduction(String name) {
        return String.format("Hello %s!", name);
    }
}
