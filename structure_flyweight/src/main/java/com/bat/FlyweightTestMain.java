package com.bat;

/**
 * @ClassName FlyweightTestMain
 * @Description 享元模式 运用共享技术有效地支持大量细粒度的对象
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/31 9:21
 **/
public class FlyweightTestMain {
    public static void main(String[] args) {
        int extrinsicState = 22; // 代码外部状态

        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight flyweightX = flyweightFactory.getFlyweight("X");
        flyweightX.operation(--extrinsicState);

        Flyweight flyweightY = flyweightFactory.getFlyweight("Y");
        flyweightY.operation(--extrinsicState);

        Flyweight flyweightZ = flyweightFactory.getFlyweight("Z");
        flyweightZ.operation(--extrinsicState);

        Flyweight unFlyweight = new UnsharedConcreteFlyweight();
        unFlyweight.operation(--extrinsicState);
    }
}
