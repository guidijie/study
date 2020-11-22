package com.jie.thread_demo.volatile_thread;

public class VolatileTest {

    public static void main(String[] args) {
        MyVolatile mv = new MyVolatile();
        Thread t1 = new Thread(mv,"A");
        Thread t2 = new Thread(mv,"B");
        Thread t3 = new Thread(mv,"C");

        t1.start();
        t2.start();
        t3.start();

//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }
}
