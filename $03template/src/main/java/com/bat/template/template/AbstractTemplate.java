package com.bat.template.template;

/**
 * 模板类 定义高级逻辑
 *
 * @author ZhengYu
 * @version 1.0 2019/12/30 14:58
 **/
public abstract class AbstractTemplate {

    /**
     * 步骤1
     *
     * @author ZhengYu
     */
    public abstract void step1();

    /**
     * 步骤2
     *
     * @author ZhengYu
     */
    public abstract void step2();

    /**
     * 步骤3
     *
     * @author ZhengYu
     */
    public abstract void step3();

    /**
     * 执行
     *
     * @author ZhengYu
     */
    public void execute() {
        step1();
        step2();
        step3();
    }
}
