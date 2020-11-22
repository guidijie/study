package com.jie.thread_demo.volatile_thread;

public class MyVolatile implements Runnable{



    public  int i = 0;

    public int add(){
        i++;
        return i;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "在执行+1操作,+1后i的值为：" + add());
        }
        System.out.println(Thread.currentThread().getName() + "循环是十次后i的值为：" + this.i);
    }


}
