package com.bat.proxy.element;

import com.bat.proxy.visitor.Department;

/**
 * @ClassName IEmployee
 * @Version: 1.0
 * @Description 抽象元素角色
 * @Author ZhengYu
 * @create: 2019/4/18
 **/
public interface IEmployee {

    void accept(Department department);
}
