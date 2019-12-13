package com.bat.proxy.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName JDKClient
 * @Version: 1.0
 * @Description
 * @Author ZhengYu
 * @create: 2019/4/26
 **/
public class JDKClient implements Observer {

    private String name;

    public JDKClient(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(this + " 接收到消息：" + arg.toString());
    }

    @Override
    public String toString() {
        return "JDKClient{" +
                "name='" + name + '\'' +
                '}';
    }
}
