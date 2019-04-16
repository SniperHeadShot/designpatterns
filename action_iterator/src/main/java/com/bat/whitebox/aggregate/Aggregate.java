package com.bat.whitebox.aggregate;

import com.bat.whitebox.iterator.Iterator;

/**
 * @ClassName Aggregate
 * @Version: 1.0
 * @Description 聚集(Aggregate)角色：此抽象角色给出创建迭代子(Iterator)对象的接口
 * @Author ZhengYu
 * @create: 2019/4/16
 **/
public abstract class Aggregate {

    /**
     * @描述 工厂方法，创建相应迭代子对象的接口
     * @创建人 ZhengYu
     * @创建时间 2019/4/16
     */
    public abstract Iterator createIterator();
}
