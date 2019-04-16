package com.bat.blackbox;

import com.bat.blackbox.aggregate.Aggregate;
import com.bat.blackbox.aggregate.ConcreteAggregate;
import com.bat.blackbox.iterator.Iterator;

/**
 * @ClassName BlackBoxClient
 * @Version: 1.0
 * @Description 黑箱聚集与内禀迭代子 客户端
 * @Author ZhengYu
 * @create: 2019/4/16
 **/
public class BlackBoxClient {
    public static void main(String[] args) {
        Object[] objArray = {"One", "Two", "Three", "Four", "Five", "Six"};
        //创建聚合对象
        Aggregate agg = new ConcreteAggregate(objArray);
        //循环输出聚合对象中的值
        Iterator it = agg.createIterator();
        while (!it.isDone()) {
            System.out.println(it.currentItem());
            it.next();
        }
    }
}
