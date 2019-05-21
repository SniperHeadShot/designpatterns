package com.bat;

/**
 * @ClassName ContextStateA
 * @Description 具体状态，每一个子类实现一个与 Context 的一个状态相关的行为
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/21 9:17
 **/
public class ContextStateA implements State {

    @Override
    public void Handle(Context context) {
        System.out.println(context.getState().toString());
        context.setState(new ContextStateB());
    }

    @Override
    public String toString() {
        return "ContextStateA{}";
    }
}
