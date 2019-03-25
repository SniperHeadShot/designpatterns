package com.bat.singleton.sychronzied;

public class SychronizedSingleton {
    private static SychronizedSingleton sychronizedSingleton;

    private SychronizedSingleton() {
    }

    public static SychronizedSingleton getSychronizedSingleton() {
        if (sychronizedSingleton == null) {
            synchronized (SychronizedSingleton.class) {
                if (sychronizedSingleton == null) {
                    sychronizedSingleton = new SychronizedSingleton();
                }
            }
        }
        return sychronizedSingleton;
    }
}
