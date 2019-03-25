package com.bat.singleton;

import com.bat.singleton.hungry.HungrySingleton;
import com.bat.singleton.lazy.LazySingleton;
import com.bat.singleton.sychronzied.SychronizedSingleton;

public class TestMain {
    public static void main(String[] args) {
        //验证饿汉式
        for (int i = 0; i < 10; i++) {
            System.out.println(HungrySingleton.getHungrySingleton());
        }
        //验证懒汉式
        for (int i = 0; i < 10; i++) {
            System.out.println(LazySingleton.getLazySingleton());
        }
        //验证高并发获取单例
        for (int i = 0; i < 10; i++) {
            System.out.println(SychronizedSingleton.getSychronizedSingleton());
        }
    }
}
