package com.bat.module.module;

/**
 * 定义一套算法的高级逻辑
 *
 * @author ZhengYu
 * @version 1.0 2020/4/27 9:58
 **/
public interface AdvancedLogicTemplate {

    // 定义抽象的逻辑由子类实现
    void step1();

    void step2();

    void step3();

    default void execute() {
        step1();
        step2();
        step3();
    }
}
