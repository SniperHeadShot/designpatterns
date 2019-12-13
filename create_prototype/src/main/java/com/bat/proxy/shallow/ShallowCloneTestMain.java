package com.bat.proxy.shallow;

public class ShallowCloneTestMain {
    public static void main(String[] args) {
        Prototype prototype = new Prototype("普通数据类型", new PrototypeInner("引用数据类型"));
        System.out.println("原始数据："+prototype.toString());
        Prototype prototypeClone = prototype.clone();
        System.out.println("克隆数据："+prototypeClone.toString());
        // 修改原始数据
        prototype.setOutsideName("[改]普通数据类型");
        prototype.getPrototypeInner().setInnerName("[改]引用数据类型");
        System.out.println("[改]原始数据："+prototype.toString());
        System.out.println("[改]克隆数据："+prototypeClone.toString());
    }
}
