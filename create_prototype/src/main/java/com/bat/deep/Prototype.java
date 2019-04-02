package com.bat.deep;

import java.io.*;

public class Prototype implements Serializable {

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

    public Prototype clonePrototype() {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        ObjectInputStream objectInputStream;
        Prototype prototype = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
            prototype = (Prototype) objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
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