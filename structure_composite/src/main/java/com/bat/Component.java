package com.bat;

/**
 * @ClassName Component
 * @Description 组合对象中的对象声明接口，在适当情况下，实现所有类共有接口默认行为，声明一个接口用于访问和管理Component的子部件
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/30 9:17
 **/
public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    /**
     * @Param [component]
     * @Return void
     * @Author ZhengYu
     * @Description: 通常用来提供增加树枝的功能
     * @Date 2019/5/30
     */
    public abstract void add(Component component);

    /**
     * @Param [component]
     * @Return void
     * @Author ZhengYu
     * @Description: 通常用来提供移除树枝的功能
     * @Date 2019/5/30
     */
    public abstract void remove(Component component);

    public abstract void display(int depth);
}
