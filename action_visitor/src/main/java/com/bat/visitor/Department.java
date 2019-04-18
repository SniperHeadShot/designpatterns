package com.bat.visitor;

import com.bat.element.FullTimeEmployee;
import com.bat.element.PartTimeEmployee;

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
