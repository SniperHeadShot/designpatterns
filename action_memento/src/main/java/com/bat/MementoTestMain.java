package com.bat;

import com.bat.caretaker.CareTaker;
import com.bat.originator.Originator;

/**
 * @ClassName MementoTestMain
 * @Version: 1.0
 * @Description 测试主类
 * @Author ZhengYu
 * @create: 2019/4/13
 **/
public class MementoTestMain {
    public static void main(String[] args) {
        //备份发起者
        Originator originator = new Originator();
        //备份管理者
        CareTaker careTaker = new CareTaker();

        System.out.println("############### 开始 ###############");

        originator.setStatus("statusOne_1", "statusTwo_1", "statusThr_1");    //改变一次状态
        careTaker.addMemento(originator.createMemento());   //制作备份并保存

        originator.setStatus("statusOne_2", "statusTwo_2", "statusThr_2");
        careTaker.addMemento(originator.createMemento());

        originator.setStatus("statusOne_3", "statusTwo_3", "statusThr_3");

        //展示当前状态
        System.out.println(originator.toString());
        originator.setMemento(careTaker.getMemento());
        System.out.println("回退一次：" + originator.toString());
        originator.setMemento(careTaker.getMemento());
        System.out.println("回退两次：" + originator.toString());

        originator.setStatus("statusOne_4", "statusTwo_4", "statusThr_4");
        careTaker.addMemento(originator.createMemento());
        System.out.println("添加新状态后" + originator.toString());
    }
}
