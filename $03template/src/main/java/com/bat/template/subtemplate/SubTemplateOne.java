package com.bat.template.subtemplate;

import com.bat.template.template.AbstractTemplate;
import lombok.extern.slf4j.Slf4j;

/**
 * 实现方式1
 *
 * @author ZhengYu
 * @version 1.0 2019/12/30 15:02
 **/
@Slf4j
public class SubTemplateOne extends AbstractTemplate {

    /**
     * 步骤1
     *
     * @author ZhengYu
     */
    @Override
    public void step1() {
        log.info("SubTemplateOne step1");
    }

    /**
     * 步骤2
     *
     * @author ZhengYu
     */
    @Override
    public void step2() {
        log.info("SubTemplateOne step2");
    }

    /**
     * 步骤3
     *
     * @author ZhengYu
     */
    @Override
    public void step3() {
        log.info("SubTemplateOne step3");
    }
}
