package com.bat.proxy.whitebox.iterator;

/**
 * @ClassName Iterator
 * @Version: 1.0
 * @Description 抽象迭代子(Iterator)角色：此抽象角色定义出遍历元素所需的接口
 * @Author ZhengYu
 * @create: 2019/4/16
 **/
public interface Iterator {

    /**
     * @描述 移动到第一个元素
     * @创建人 ZhengYu
     * @创建时间 2019/4/16
     */
    void first();

    /**
     * @描述 移动到下一个元素
     * @创建人 ZhengYu
     * @创建时间 2019/4/16
     */
    void next();

    /**
     * @描述 是否为最后一个元素
     * @创建人 ZhengYu
     * @创建时间 2019/4/16
     */
    boolean isDone();

    /**
     * @描述 返还当前元素
     * @创建人 ZhengYu
     * @创建时间 2019/4/16
     */
    Object currentItem();
}
