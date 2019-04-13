package com.bat.originator;

import com.bat.memento.Memento;

/**
 * @ClassName Originator
 * @Version: 1.0
 * @Description 发起类
 * @Author ZhengYu
 * @create: 2019/4/13
 **/
public class Originator {

    /*备份statusOne,statusTwo的值*/
    private String statusOne;
    private String statusTwo;
    /*不备份statusThr的值*/
    private String statusThr;

    /**
     * @描述 创建Memento
     * @创建人 ZhengYu
     * @创建时间 2019/4/13
     */
    public Memento createMemento() {
        return new Memento(statusOne, statusTwo);
    }

    /**
     * @描述 利用备份的数据恢复数据
     * @创建人 ZhengYu
     * @创建时间 2019/4/13
     */
    public void setMemento(Memento memento) {
        this.statusOne = memento.getStatusOne();
        this.statusTwo = memento.getStatusTwo();
    }

    public void setStatus(String statusOne, String statusTwo, String statusThr) {
        this.statusOne = statusOne;
        this.statusTwo = statusTwo;
        this.statusThr = statusThr;
    }

    @Override
    public String toString() {
        return "Originator{" +
                "statusOne='" + statusOne + '\'' +
                ", statusTwo='" + statusTwo + '\'' +
                ", statusThr='" + statusThr + '\'' +
                '}';
    }
}