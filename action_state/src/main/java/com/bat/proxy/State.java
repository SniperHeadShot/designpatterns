package com.bat.proxy;

/**
 * @ClassName State
 * @Description 定义一个接口以封装与 Context 的一个特定状态相关的行为
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/21 9:07
 **/
public interface State {

    void Handle(Context context);
}
