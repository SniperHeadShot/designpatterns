package com.bat.proxy;

/**
 * @ClassName Flyweight
 * @Description 所有享元类的超类或者接口，通过这个接口，Flyweight 可以接受并作用于外部状态
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/31 9:23
 **/
public abstract class Flyweight {

    /**
     * @Param []
     * @Return void
     * @Author ZhengYu
     * @Description: 所有享元类的接口
     * @Date 2019/5/31
     */
    public abstract void operation(int extrinsicState);

}
