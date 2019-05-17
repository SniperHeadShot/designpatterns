package com.bat;

/**
 * @ClassName TemplateMethod
 * @Version: 1.0
 * @Description 抽象的顶级逻辑
 * @Author ZhengYu
 * @create: 2019/5/17
 **/
public abstract class TemplateMethod {

    /**
     * @描述 抽象行为，子类去实现
     * @创建人 ZhengYu
     * @创建时间 2019/5/17
     */
    protected abstract void primitiveOperation1();

    protected abstract void primitiveOperation2();

    /**
     * @描述 逻辑方法，给出逻辑的骨架,为防止恶意操作，一般模板方法都加上 final 关键词
     * @创建人 ZhengYu
     * @创建时间 2019/5/17
     */
    public final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
    }
}
