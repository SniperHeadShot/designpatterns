package com.bat.proxy.deep;

import java.io.Serializable;

public class PrototypeInner implements Serializable {

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
