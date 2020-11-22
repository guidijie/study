package com.jie.single;

import java.util.Random;

public class Singleton5 {

    private static Singleton5 singleton5;
    private static Random random = new Random();
    private Singleton5() {

    }

    public static Singleton5 getInstance() {
        //优化线程
        if(singleton5 == null){
            //为Singleton5这个类加锁，从而达到多线程情况下安全
            synchronized (Singleton5.class){
                //判断singleton4是否为null，不为null直接返回之前new的Singleton4对象
                if (singleton5 == null) {
                    try {
                        //随机延迟，当进入这个方法时每个线程延迟时间不一致
                        Thread.sleep(random.nextInt(5) * 1000);
                        singleton5 = new Singleton5();
                    } catch (Exception e) {
                        System.out.println("错误");
                    }
                }
            }
        }
        return singleton5;
    }
}
