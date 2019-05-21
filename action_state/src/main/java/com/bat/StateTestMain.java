package com.bat;

/**
 * @ClassName StateTestMain
 * @Description 状态模式：当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/21 9:05
 **/
public class StateTestMain {
    public static void main(String[] args) {
        Context context = new Context(new ContextStateA());
        context.request();
        context.request();
        context.request();
        context.request();
        context.request();
    }
}
