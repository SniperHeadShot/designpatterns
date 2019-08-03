package com.bat.base;

import com.bat.RealAbstractSubject;
import com.bat.AbstractSubject;
import lombok.extern.slf4j.Slf4j;

/**
 * 代理类,保存一个引用使得代理可以访问实体，提供一个与 AbstractSubject 的接口相同的接口，这样代理就可以用来替换实体
 *
 * @author ZhengYu
 * @version 1.0 2019/8/3 18:05
 **/
@Slf4j
public class Proxy extends AbstractSubject {

    private AbstractSubject abstractSubject;

    @Override
    public void request() {
        if(abstractSubject == null){
            abstractSubject = new RealAbstractSubject();
        }
        log.info("do something before proxy!");
        abstractSubject.request();
        log.info("do something after proxy!");
    }
}
