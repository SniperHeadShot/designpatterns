package com.bat.proxy.objectstructure;

import com.bat.proxy.element.IEmployee;
import com.bat.proxy.visitor.Department;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName EmployeeList
 * @Version: 1.0
 * @Description 对象结构类
 * @Author ZhengYu
 * @create: 2019/4/18
 **/
public class EmployeeList {

    private List<IEmployee> employeeList = new ArrayList<>();

    public void addEmployee(IEmployee iEmployee) {
        employeeList.add(iEmployee);
    }

    public void accept(Department department) {
        for (IEmployee iEmployeeSingle : employeeList) {
            iEmployeeSingle.accept(department);
        }
    }
}
