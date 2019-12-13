package com.bat.proxy.memento;

/**
 * @ClassName Memento
 * @Version: 1.0
 * @Description 备忘录
 * @Author ZhengYu
 * @create: 2019/4/13
 **/
public class Memento {

    private String statusOne;
    private String statusTwo;

    public Memento(String statusOne, String statusTwo) {
        this.statusOne = statusOne;
        this.statusTwo = statusTwo;
    }

    public String getStatusOne() {
        return statusOne;
    }

    public String getStatusTwo() {
        return statusTwo;
    }
}
