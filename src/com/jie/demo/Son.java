package com.jie.demo;

import java.util.Objects;

public class Son extends Father{
    public static String aa = "asd";
    public String name = getName();
    public static int age = getAge();

    static{
        System.out.println("6");
    }

    public Son(){
        System.out.println("7");

    }

    {
        System.out.println("8");
    }

    public String getName() {
        System.out.println("9");
        return "lisi";
    }

    public static int getAge() {
        System.out.println("10");
        return 18;
    }

    public static void main(String[] args) {

        Son son =new Son();
    }


}
