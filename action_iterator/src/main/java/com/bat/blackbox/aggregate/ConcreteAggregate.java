package com.bat.blackbox.aggregate;

import com.bat.blackbox.iterator.Iterator;

/**
 * @ClassName ConcreteAggregate
 * @Version: 1.0
 * @Description 具体聚集角色类，实现了抽象聚集角色所要求的接口
 * 聚集类有一个内部成员类ConcreteIterator，这个内部类实现了抽象迭代子角色所规定的接口
 * 工厂方法createIterator()所返还的就是这个内部成员类的实例
 * @Author ZhengYu
 * @create: 2019/4/16
 **/
public class ConcreteAggregate extends Aggregate {

    private Object[] objArray = null;

    public ConcreteAggregate(Object[] objArray) {
        this.objArray = objArray;
    }

    /**
     * @描述 工厂方法，创建相应迭代子对象的接口
     * @创建人 ZhengYu
     * @创建时间 2019/4/16
     */
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator();
    }

    /**
     * @ClassName ConcreteIterator
     * @Version: 1.0
     * @Description 内部成员类，具体迭代子类
     * @Author ZhengYu
     * @create: 2019/4/16
     **/
    private class ConcreteIterator implements Iterator {
        //内部索引，记录当前迭代到的索引位置
        private int index;
        //记录当前聚集对象的大小
        private int size;

        public ConcreteIterator() {
            this.size = objArray.length;
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
            return objArray[index];
        }
    }
}
