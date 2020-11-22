package com.jie.thread_demo;

public class VolatileTest {

    public static void main(String[] args) {
        VolatileDemo volatileDemo = new VolatileDemo();
        Thread t1 = new Thread(volatileDemo,"A");
        Thread t2 = new Thread(volatileDemo,"B");
        Thread t3 = new Thread(volatileDemo,"C");

        t1.start();
//        t2.start();
//        t3.start();

        System.out.println(volatileDemo.v.i);
    }
}
