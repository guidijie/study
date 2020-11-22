package com.jie.thread_demo;

public class VolatileDemo implements Runnable{

    final MyVolatile v = new MyVolatile();

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            v.add();
        }
        System.out.println(v.i);
    }
}
