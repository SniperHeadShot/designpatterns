package com.bat;

/**
 * @ClassName ConcreteClassA
 * @Version: 1.0
 * @Description 逻辑实现A
 * @Author ZhengYu
 * @create: 2019/5/17
 **/
public class ConcreteClassA extends TemplateMethod {

    /**
     * @描述 抽象行为
     * @创建人 ZhengYu
     * @创建时间 2019/5/17
     */
    @Override
    protected void primitiveOperation1() {
        System.out.println("具体类A方法1实现");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("具体类A方法2实现");
    }
}
