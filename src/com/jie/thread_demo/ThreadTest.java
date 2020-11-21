package com.jie.thread_demo;

public  class  ThreadTest {

    public static void main(String[] args) {
        //创建线程任务对象
        Ticket ticket = new Ticket();
        //开设三个窗口
        Thread t = new Thread(ticket,"A窗口");
        Thread t2 = new Thread(ticket,"B窗口");
        Thread t3 = new Thread(ticket,"C窗口");
        //三个窗口现在同时卖票
        t.start();
        t2.start();
        t3.start();


    }
}
