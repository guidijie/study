package com.jie.demo;

public class Father {

    public String name = getName();
    public static int age = getAge();

    static{
        System.out.println("1");
    }

    public Father(){
        System.out.println("2");
    }

    {
        System.out.println("3");
    }

    public String getName() {
        System.out.println("4");
        return "lisi";
    }

    public static int getAge() {
        System.out.println("5");
        return 18;
    }
}
