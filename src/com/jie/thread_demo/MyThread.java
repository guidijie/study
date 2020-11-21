package com.jie.thread_demo;

import java.util.Objects;

public class MyThread extends Thread{
    public static String name;

    public MyThread(){
        System.out.println("当前线程是：" + Thread.currentThread().getName());
        System.out.println("aa:" + this);
    }

    @Override
    public void run() {
        System.out.println("我是线程: " + Thread.currentThread().getName() + "  " + this.getName());
        System.out.println("bb:" + this);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是线程: " + Thread.currentThread().getName());
            }
        });
        t.setName("tttt");
        t.start();

    }



    public static void main(String[] args){

//        MyThread myThread1 = new MyThread();
//        MyThread myThread2 = new MyThread();
//        MyThread myThread3 = new MyThread();
        MyThread myThread4 = new MyThread();
        myThread4.setName("t1");

        Thread thread5 = new Thread(myThread4);
        Thread thread6 = new Thread(() -> {
            System.out.println("我是线程: " + Thread.currentThread().getName() + "  ");
        });
        thread6.setName("t6");
        thread6.start();


        thread5.setName("t2");

//        myThread1.start();
//        myThread2.start();
//        myThread3.start();
//        myThread4.run();
        thread5.start();

    }
}
