package com.bat.proxy;

/**
 * @ClassName TemplateModelTestMail
 * @Version: 1.0
 * @Description 模板模式测试主类：定义一个操作中算法的骨架，将一些步骤延迟到子类中
 * @Author ZhengYu
 * @create: 2019/5/17
 **/
public class TemplateModelTestMail {
    public static void main(String[] args) {
        TemplateMethod templateMethod;

        templateMethod = new ConcreteClassA();
        templateMethod.templateMethod();

        templateMethod = new ConcreteClassB();
        templateMethod.templateMethod();
    }
}
