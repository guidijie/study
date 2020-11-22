package com.jie.single;
import java.util.Random;

public class Singleton4 {

    private static Singleton4 singleton4;
    private static Random random = new Random();
    private Singleton4() {

    }

    public static Singleton4 getInstance() {
        //判断singleton4是否为null，不为null直接返回之前new的Singleton4对象
        if (singleton4 == null) {
            try {
                //随机延迟，当进入这个方法时每个线程延迟时间不一致
                Thread.sleep(random.nextInt(5) * 1000);
                singleton4 = new Singleton4();
            } catch (Exception e) {
                System.out.println("错误");
            }
        }
        return singleton4;
    }
}
