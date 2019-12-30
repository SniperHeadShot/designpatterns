package com.bat.template;

import com.bat.template.subtemplate.SubTemplateOne;
import com.bat.template.subtemplate.SubTemplateTwo;
import com.bat.template.template.AbstractTemplate;

/**
 * 模板模式
 * 父类定义高级逻辑，子类负责具体的实现
 *
 * @author ZhengYu
 * @version 1.0 2019/12/30 14:56
 **/
public class TemplateClient {
    public static void main(String[] args) {
        AbstractTemplate abstractTemplate = new SubTemplateOne();
        abstractTemplate.execute();
        abstractTemplate = new SubTemplateTwo();
        abstractTemplate.execute();
    }
}
