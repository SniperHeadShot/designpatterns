package com.bat.base;

import com.bat.SubjectInterfaceImpl;
import com.bat.SubjectInterface;
import lombok.extern.slf4j.Slf4j;

/**
 * 代理类,保存一个引用使得代理可以访问实体，提供一个与 SubjectInterface 的接口相同的接口，这样代理就可以用来替换实体
 *
 * @author ZhengYu
 * @version 1.0 2019/8/3 18:05
 **/
@Slf4j
public class Proxy implements SubjectInterface {

    private SubjectInterface subjectInterface;

    @Override
    public void request() {
        if(subjectInterface == null){
            subjectInterface = new SubjectInterfaceImpl();
        }
        log.info("do something before proxy!");
        subjectInterface.request();
        log.info("do something after proxy!");
    }
}
