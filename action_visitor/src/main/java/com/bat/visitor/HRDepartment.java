package com.bat.visitor;

import com.bat.element.FullTimeEmployee;
import com.bat.element.PartTimeEmployee;

/**
 * @ClassName FinanceDepartment
 * @Version: 1.0
 * @Description 具体访问者角色
 * @Author ZhengYu
 * @create: 2019/4/18
 **/
public class HRDepartment implements Department {

    @Override
    public void visit(FullTimeEmployee fullTimeEmployee) {
        int workTime = fullTimeEmployee.getWorkTime();
        if (workTime > 40) {
            System.out.println(String.format("正式员工 %s 实际工作时间为：%d 小时,其中加班 %d 小时", fullTimeEmployee.getName(), workTime, workTime - 40));
        } else {
            System.out.println(String.format("正式员工 %s 实际工作时间为：%d 小时,其中请假 %d 小时", fullTimeEmployee.getName(), workTime, 40 - workTime));
        }
    }

    @Override
    public void visit(PartTimeEmployee partTimeEmployee) {
        System.out.println(String.format("临时工 %s 实际工作时间为：%d 小时", partTimeEmployee.getName(), partTimeEmployee.getWorkTime()));
    }


}
