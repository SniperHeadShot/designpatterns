package com.bat.shallow;

public class Prototype implements Cloneable{

    private String outsideName;
    private PrototypeInner prototypeInner;

    public Prototype(String outsideName, PrototypeInner prototypeInner) {
        this.outsideName = outsideName;
        this.prototypeInner = prototypeInner;
    }

    public String getOutsideName() {
        return outsideName;
    }

    public void setOutsideName(String outsideName) {
        this.outsideName = outsideName;
    }

    public PrototypeInner getPrototypeInner() {
        return prototypeInner;
    }

    public void setPrototypeInner(PrototypeInner prototypeInner) {
        this.prototypeInner = prototypeInner;
    }

    protected final Prototype clone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "outsideName='" + outsideName + '\'' +
                ", prototypeInner=" + prototypeInner.getInnerName() +
                '}';
    }
}