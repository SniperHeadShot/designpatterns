package com.bat;

/**
 * @ClassName UnsharedConcreteFlyweight
 * @Description 指不需要共享的 Flyweight 子类，因为 Flyweight 接口共享成为可能，但它并不强制共享
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/31 9:30
 **/
public class UnsharedConcreteFlyweight extends Flyweight {

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
        System.out.println("不共享的具体 Flyweight：" + extrinsicState);
    }
}
