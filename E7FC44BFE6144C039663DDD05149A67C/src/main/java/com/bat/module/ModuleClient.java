package com.bat.module;

import com.bat.module.module.AdvancedLogicTemplate;

/**
 * 模板模式
 * 核心思想: 定义一套高级逻辑, 然后由子类去实现
 *
 * @author ZhengYu
 * @version 1.0 2020/4/27 9:55
 **/
public class ModuleClient {
    public static void main(String[] args) {

        // 可以定义高级逻辑的各种实现 - 实现方式1
        new AdvancedLogicTemplate() {
            @Override
            public void step1() {
                System.out.println("step1 实现方式1");
            }

            @Override
            public void step2() {
                System.out.println("step2 实现方式1");
            }

            @Override
            public void step3() {
                System.out.println("step3 实现方式1");
            }
        }.execute();

        // 可以定义高级逻辑的各种实现 - 实现方式2
        new AdvancedLogicTemplate() {
            @Override
            public void step1() {
                System.out.println("step1 实现方式2");
            }

            @Override
            public void step2() {
                System.out.println("step2 实现方式2");
            }

            @Override
            public void step3() {
                System.out.println("step3 实现方式2");
            }
        }.execute();
    }
}
