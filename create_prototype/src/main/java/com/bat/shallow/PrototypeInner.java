package com.bat.shallow;

public class PrototypeInner implements Cloneable{

    private String innerName;

    public PrototypeInner(String innerName) {
        this.innerName = innerName;
    }

    public String getInnerName() {
        return innerName;
    }

    public void setInnerName(String innerName) {
        this.innerName = innerName;
    }
}
