package com.bat.proxy.visitor;

import com.bat.proxy.element.FullTimeEmployee;
import com.bat.proxy.element.PartTimeEmployee;

/**
 * @ClassName Department
 * @Version: 1.0
 * @Description 抽象访问者角色
 * @Author ZhengYu
 * @create: 2019/4/18
 **/
public interface Department {

    void visit(FullTimeEmployee fullTimeEmployee);

    void visit(PartTimeEmployee partTimeEmployee);

}
