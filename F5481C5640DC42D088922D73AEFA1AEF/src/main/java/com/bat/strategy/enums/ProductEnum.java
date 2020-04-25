package com.bat.strategy.enums;

/**
 * 商品枚举
 *
 * @author ZhengYu
 * @version 1.0 2020/4/25 11:06
 **/
public enum ProductEnum {

    APPLE("apple", "苹果"),
    MILK("milk", "牛奶"),
    ;

    private String type;
    private String name;

    ProductEnum(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }}
