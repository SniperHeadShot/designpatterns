package com.bat.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Composite
 * @Description 定义枝节点行为，用来存储子部件，在Component接口中实现与子部件有关的操作
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/30 9:32
 **/
public class Composite extends Component {

    private List<Component> children = new ArrayList<>(); //一个子节点集合用来存储其下属的枝节点和叶节点

    public Composite(String name) {
        super(name);
    }

    /**
     * @param component
     * @Param [component]
     * @Return void
     * @Author ZhengYu
     * @Description: 通常用来提供增加树枝的功能
     * @Date 2019/5/30
     */
    @Override
    public void add(Component component) {
        children.add(component);
    }

    /**
     * @param component
     * @Param [component]
     * @Return void
     * @Author ZhengYu
     * @Description: 通常用来提供移除树枝的功能
     * @Date 2019/5/30
     */
    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        System.out.println(depth + " - " + name);
        for (Component component : children) {
            component.display(depth + 1);
        }
    }
}
