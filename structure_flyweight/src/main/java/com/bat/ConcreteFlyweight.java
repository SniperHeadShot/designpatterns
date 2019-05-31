package com.bat;

/**
 * @ClassName ConcreteFlyweight
 * @Description 基础 Flyweight 超类或者实现 Flyweight 接口，并为内部状态增加存储空间
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/31 9:24
 **/
public class ConcreteFlyweight extends Flyweight {

    /**
     * @param extrinsicState
     * @Param []
     * @Return void
     * @Author ZhengYu
     * @Description: 所有享元类的接口
     * @Date 2019/5/31
     */
    @Override
    public void operation(int extrinsicState) {
        System.out.println("具体 Flyweight：" + extrinsicState);
    }
}
