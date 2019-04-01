package com.bat.productpart;

public class PartA {

    private String partName;

    public PartA(String partName) {
        this.partName = partName;
    }

    @Override
    public String toString() {
        return "PartA{" +
                "partName='" + partName + '\'' +
                '}';
    }
}
