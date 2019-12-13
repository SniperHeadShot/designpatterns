package com.bat.proxy;

import java.util.Hashtable;
import java.util.Map;

/**
 * @ClassName FlyweightFactory
 * @Description 享元工厂，用来创建并管理 Flyweight 对象，主要是用来确保合理地共享 Flyweight
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/31 9:33
 **/
public class FlyweightFactory {

    private Map<String, Flyweight> flyweights = new Hashtable<>();

    public FlyweightFactory() {
        flyweights.put("X", new ConcreteFlyweight());
        flyweights.put("Y", new ConcreteFlyweight());
        flyweights.put("Z", new ConcreteFlyweight());
    }

    /**
     * @Param [key]
     * @Return com.bat.Flyweight
     * @Author ZhengYu
     * @Description: 根据客户端请求，获得已生成的实例
     * @Date 2019/5/31
     */
    public Flyweight getFlyweight(String key) {
        return flyweights.get(key);
    }
}
