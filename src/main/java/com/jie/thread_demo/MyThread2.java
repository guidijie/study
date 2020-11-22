package com.jie.thread_demo;

public class MyThread2 extends Thread{

    @Override
    public void run() {
        System.out.println("run_当前线程是： " + Thread.currentThread().getName() + "  开始时间：" + System.currentTimeMillis());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("run_当前线程是： " + Thread.currentThread().getName() + "  结束时间：" + System.currentTimeMillis());
    }

    public static void main(String[] args) {
        System.out.println("main开始时间：" + System.currentTimeMillis());

        MyThread2 t1 = new MyThread2();
        t1.setName("t1");
        MyThread2 t2 = new MyThread2();
        t2.setName("t2");



        t1.run();
        t2.run();

        System.out.println("main结束时间：" + System.currentTimeMillis());



    }
}
