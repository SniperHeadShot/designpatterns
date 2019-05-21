package com.bat;

/**
 * @ClassName Context
 * @Description 维护一个状态实例，这个实例定义当前的状态
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/21 9:09
 **/
public class Context {

    private State state;

    /**
     * @Param [state]
     * @Return
     * @Author ZhengYu
     * @Description: 定义 Context 的初始状态
     * @Date 2019/5/21
     */
    public Context(State state) {
        this.state = state;
    }

    /**
     * @Param []
     * @Return
     * @Author ZhengYu
     * @Description: 可读写的状态属性，用于读取当前状态和设置新状态
     * @Date 2019/5/21
     */
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    /**
     * @Param []
     * @Return void
     * @Author ZhengYu
     * @Description: 对请求做处理，并设置下一状态
     * @Date 2019/5/21
     */
    public void request() {
        state.Handle(this);
    }
}
