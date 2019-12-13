package com.bat.proxy.visitor;

import com.bat.proxy.element.FullTimeEmployee;
import com.bat.proxy.element.PartTimeEmployee;

/**
 * @ClassName FinanceDepartment
 * @Version: 1.0
 * @Description 具体访问者角色
 * @Author ZhengYu
 * @create: 2019/4/18
 **/
public class FinanceDepartment implements Department {

    @Override
    public void visit(FullTimeEmployee fullTimeEmployee) {
        int workTime = fullTimeEmployee.getWorkTime();
    double weekWage = fullTimeEmployee.getWeeklyWage();
        if (workTime > 40) {
        weekWage = weekWage * workTime + (workTime - 40) * 100;
    } else if (workTime < 40) {
        weekWage = weekWage * workTime - (40 - workTime) * 80;
        if (weekWage < 0) {
            weekWage = 0;
        }
    }
        System.out.println(String.format("正式员工 %s 实际工资为：%f 元", fullTimeEmployee.getName(), weekWage));
}

    @Override
    public void visit(PartTimeEmployee partTimeEmployee) {
        int workTime = partTimeEmployee.getWorkTime();
        double hourWage = partTimeEmployee.getWeeklyWage();
        System.out.println(String.format("临时工 %s 实际工资为：%f 元", partTimeEmployee.getName(), hourWage * workTime));
    }
}
