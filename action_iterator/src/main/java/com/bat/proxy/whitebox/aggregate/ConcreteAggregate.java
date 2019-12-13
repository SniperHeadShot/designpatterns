package com.bat.proxy.whitebox.aggregate;

import com.bat.proxy.whitebox.iterator.ConcreteIterator;
import com.bat.proxy.whitebox.iterator.Iterator;

/**
 * @ClassName ConcreteAggregate
 * @Version: 1.0
 * @Description 具体聚集(ConcreteAggregate)角色：实现了创建迭代子(Iterator)对象的接口，返回一个合适的具体迭代子实例
 * @Author ZhengYu
 * @create: 2019/4/16
 **/
public class ConcreteAggregate extends Aggregate {

    private Object[] objArr;

    public ConcreteAggregate(Object[] objArr) {
        this.objArr = objArr;
    }

    /**
     * @描述 工厂方法，创建相应迭代子对象的接口
     * @创建人 ZhengYu
     * @创建时间 2019/4/16
     */
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    /**
     * @描述 取值方法：向外界提供聚集元素
     * @创建人 ZhengYu
     * @创建时间 2019/4/16
     */
    public Object getElement(int index) {
        return index < objArr.length ? objArr[index] : null;
    }

    /**
     * @描述 取值方法：向外界提供聚集的大小
     * @创建人 ZhengYu
     * @创建时间 2019/4/16
     */
    public int size() {
        return objArr.length;
    }
}
