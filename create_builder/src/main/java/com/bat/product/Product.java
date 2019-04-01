package com.bat.product;

import com.bat.productpart.PartA;
import com.bat.productpart.PartB;
import com.bat.productpart.PartC;

public class Product {

    private PartA partA;
    private PartB partB;
    private PartC partC;

    public PartA getPartA() {
        return partA;
    }

    public void setPartA(PartA partA) {
        this.partA = partA;
    }

    public PartB getPartB() {
        return partB;
    }

    public void setPartB(PartB partB) {
        this.partB = partB;
    }

    public PartC getPartC() {
        return partC;
    }

    public void setPartC(PartC partC) {
        this.partC = partC;
    }

    @Override
    public String toString() {
        return "Product{" +
                "partA=" + partA +
                ", partB=" + partB +
                ", partC=" + partC +
                '}';
    }
}
