package com.bat.proxy;

/**
 * @ClassName FacadeTestMain
 * @Description 外观模式： 为子系统中的一组接口提供一个一致的界面，此模型定义了一个高层接口，这个接口使得这一子系统更加容易使用
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/28 9:13
 **/
public class FacadeTestMain {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.method();
    }
}
