package com.bat.proxy;

/**
 * @ClassName Adapter
 * @Description 适配器类，在内部封装一个待适配类对象，把源接口转换成目标接口
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/23 10:28
 **/
public class Adapter implements TargetClass {

    private NeedAdapterClass needAdapterClass = new NeedAdapterClass();

    /**
     * @Param []
     * @Return void
     * @Author ZhengYu
     * @Description: 适配方法
     * @Date 2019/5/24
     */
    public void request() {
        needAdapterClass.request();
    }
}
