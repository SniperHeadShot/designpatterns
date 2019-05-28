package com.bat;

/**
 * @ClassName Facade
 * @Description 外观类，知道哪些子系统类负责处理请求，将客户的请求代理给适当的的子系统对象
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/28 9:15
 **/
public class Facade {

    private SubSystemOne subSystemOne;

    private SubSystemTwo subSystemTwo;

    public Facade() {
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
    }

    public void method() {
        subSystemOne.method();
        subSystemTwo.method();
    }
}
