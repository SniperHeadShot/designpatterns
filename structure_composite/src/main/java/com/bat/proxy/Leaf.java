package com.bat.proxy;

/**
 * @ClassName Leaf
 * @Description 在组合中表示叶节点对象，叶节点没有子节点
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/30 9:22
 **/
public class Leaf extends Component {

    public Leaf(String name) {
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
        System.out.println("Cannot add to leaf");
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
        System.out.println("Cannot remove from a leaf");
    }

    @Override
    public void display(int depth) {
        System.out.println(depth + " - " + name);
    }
}
