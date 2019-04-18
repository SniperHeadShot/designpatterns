package com.bat.element;

import com.bat.visitor.Department;
import lombok.Data;

/**
 * @ClassName FullTimeEmployee
 * @Version: 1.0
 * @Description 具体元素角色
 * @Author ZhengYu
 * @create: 2019/4/18
 **/
@Data
public class FullTimeEmployee implements IEmployee {

    private String name;
    private Double weeklyWage;
    private int workTime;

    public FullTimeEmployee(String name, Double weeklyWage, int workTime) {
        this.name = name;
        this.weeklyWage = weeklyWage;
        this.workTime = workTime;
    }

    public void accept(Department department) {
        department.visit(this);
    }
}
