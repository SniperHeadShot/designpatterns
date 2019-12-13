package com.bat.proxy.whitebox;

import com.bat.proxy.whitebox.aggregate.Aggregate;
import com.bat.proxy.whitebox.aggregate.ConcreteAggregate;
import com.bat.proxy.whitebox.iterator.Iterator;

/**
 * @ClassName WhiteBoxClient
 * @Version: 1.0
 * @Description 白箱聚集与外禀迭代子 客户端
 * @Author ZhengYu
 * @create: 2019/4/16
 **/
public class WhiteBoxClient {
    public static void main(String[] args) {
        Object[] objArray = {"One", "Two", "Three", "Four", "Five", "Six"};
        //创建聚合对象
        Aggregate aggregate = new ConcreteAggregate(objArray);
        //循环输出聚合对象中的值
        Iterator it = aggregate.createIterator();
        while (!it.isDone()) {
            System.out.println(it.currentItem());
            it.next();
        }
    }
}
