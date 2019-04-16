package com.bat.whitebox.iterator;

import com.bat.whitebox.aggregate.ConcreteAggregate;

/**
 * @ClassName ConcreteIterator
 * @Version: 1.0
 * @Description 具体聚集(ConcreteAggregate)角色：实现了创建迭代子(Iterator)对象的接口，返回一个合适的具体迭代子实例
 * @Author ZhengYu
 * @create: 2019/4/16
 **/
public class ConcreteIterator implements Iterator {
    //持有被迭代的具体的聚合对象
    private ConcreteAggregate concreteAggregate;
    //内部索引，记录当前迭代到的索引位置
    private int index;
    //记录当前聚集对象的大小
    private int size;

    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
        this.size = concreteAggregate.size();
        index = 0;
    }

    /**
     * @描述 移动到第一个元素
     * @创建人 ZhengYu
     * @创建时间 2019/4/16
     */
    public void first() {
        index = 0;
    }

    /**
     * @描述 移动到下一个元素
     * @创建人 ZhengYu
     * @创建时间 2019/4/16
     */
    public void next() {
        if (index < size) {
            index++;
        }
    }

    /**
     * @描述 是否为最后一个元素
     * @创建人 ZhengYu
     * @创建时间 2019/4/16
     */
    public boolean isDone() {
        return index >= size;
    }

    /**
     * @描述 返还当前元素
     * @创建人 ZhengYu
     * @创建时间 2019/4/16
     */
    public Object currentItem() {
        return concreteAggregate.getElement(index);
    }
}
