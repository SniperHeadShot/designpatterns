package com.bat.proxy;

import com.bat.proxy.element.FullTimeEmployee;
import com.bat.proxy.element.IEmployee;
import com.bat.proxy.element.PartTimeEmployee;
import com.bat.proxy.objectstructure.EmployeeList;
import com.bat.proxy.visitor.Department;
import com.bat.proxy.visitor.FinanceDepartment;
import com.bat.proxy.visitor.HRDepartment;

/**
 * @ClassName Client
 * @Version: 1.0
 * @Description 客户端
 * @Author ZhengYu
 * @create: 2019/4/18
 **/
public class Client {
    public static void main(String[] args) {
        EmployeeList empList = new EmployeeList();
        IEmployee fteA = new FullTimeEmployee("梁思成", 3200.00, 45);
        IEmployee fteB = new FullTimeEmployee("徐志摩", 2000.00, 40);
        IEmployee fteC = new FullTimeEmployee("梁徽因", 2400.00, 38);
        IEmployee fteD = new PartTimeEmployee("方鸿渐", 80.00, 20);
        IEmployee fteE = new PartTimeEmployee("唐宛如", 60.00, 18);

        empList.addEmployee(fteA);
        empList.addEmployee(fteB);
        empList.addEmployee(fteC);
        empList.addEmployee(fteD);
        empList.addEmployee(fteE);
        Department financeDepartment = new FinanceDepartment();
        empList.accept(financeDepartment);
        System.out.println("##################################");
        Department hRDepartment = new HRDepartment();
        empList.accept(hRDepartment);
    }
}
