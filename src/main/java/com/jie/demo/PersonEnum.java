package com.jie.demo;

public enum PersonEnum {

    WOMAN(0, "woman"),
    MAN(1, "man");

    private int type;

    private String describe;

    PersonEnum(int type, String describe) {
        this.type = type;
        this.describe = describe;
    }

    public int getType() {
        return type;
    }

    public String getDescribe() {
        return describe;
    }
}
