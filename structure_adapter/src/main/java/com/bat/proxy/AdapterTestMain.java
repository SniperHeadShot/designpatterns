package com.bat.proxy;

/**
 * @ClassName AdapterTestMain
 * @Description 适配器模式测试主类
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/23 10:02
 **/
public class AdapterTestMain {
    public static void main(String[] args) {
        TargetClass targetClass = new Adapter();
        targetClass.request();
    }
}
