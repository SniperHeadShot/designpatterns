package com.bat.proxy.caretaker;

import com.bat.proxy.memento.Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CareTaker
 * @Version: 1.0
 * @Description 备份管理类
 * @Author ZhengYu
 * @create: 2019/4/13
 **/
public class CareTaker {

    private int backIndex;    //下标
    private boolean isBackFlag;    //是否处于退回状态
    private List<Memento> mementoList = new ArrayList<Memento>();

    /**
     * @描述 添入一个备份数据
     * @创建人 ZhengYu
     * @创建时间 2019/4/13
     */
    public void addMemento(Memento memento) {
        //如果有新增的状态备份则将之前的状态备份清空
        if (isBackFlag && !mementoList.isEmpty()) {
            mementoList.clear();
        }
        isBackFlag = false;
        mementoList.add(memento);
    }

    /**
     * @描述 获取回退备份数据，支持多步
     * @创建人 ZhengYu
     * @创建时间 2019/4/13
     */
    public Memento getMemento() {
        if (!isBackFlag) {
            backIndex = mementoList.size() - 1;
        }
        isBackFlag = true;
        return backIndex >= 0 ? mementoList.get(backIndex--) : null;
    }
}
