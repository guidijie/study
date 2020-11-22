package com.jie.thread_demo;

public class  MyThread3 implements Runnable{
    private String name;
    public MyThread3(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(this.name);
        }
    }

}
