package com.bat.proxy.singleton.hungry;

public class HungrySingleton {
    //直接new出对象
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getHungrySingleton() {
        return hungrySingleton;
    }
}
