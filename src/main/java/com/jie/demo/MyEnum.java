package com.jie.demo;

public enum  MyEnum {

    AAA,
    BBB,
    CCC,
    DDD;

    private String name;
    private int age;
    private String sex;

    MyEnum(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    MyEnum() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public static void main(String[] args) {
        MyEnum.AAA.setName("aaa");
        System.out.println(MyEnum.AAA.getName());

        switch(MyEnum.BBB){
            case AAA:
                System.out.println("AAA");
                break;
            case BBB:
                System.out.println("BBB");
                break;
        }
    }
}
