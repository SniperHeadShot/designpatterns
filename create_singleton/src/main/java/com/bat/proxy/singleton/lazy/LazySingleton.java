package com.bat.proxy.singleton.lazy;

public class LazySingleton {
    private static LazySingleton lazySingleton;

    private LazySingleton() {
    }

    public static LazySingleton getLazySingleton() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
