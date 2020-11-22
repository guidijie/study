package com.jie.thread_demo.synchronizd;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {

    //总票数
    private int ticket = 10;
    Object obj = new Object();
    Lock lock = new ReentrantLock();
//    @Override
//    public void run() {
//        //卖票窗口一直开启
//        while (true) {
//            //保证某个窗口在进行卖票的时候，其他的窗口无法卖次张票
//            synchronized (obj) {
//                //判断是否有票
//                if (ticket > 0) {
//                    //获取正在‘卖票的窗口‘
//                    String name = Thread.currentThread().getName();
//                    System.out.println(name + "正在卖：" + ticket);
//                    ticket--; // 卖完，票减一
//                } else {
//                    //票卖完了就关闭这个窗口
//                    break;
//                }
//            }
//            try {
//                //模拟当前窗口卖完出票需要5毫秒时间
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }

//    @Override
//    public void run() {
//        //卖票窗口一直开启
//        while (true) {
//
//            if(!sellTicket()){
//                //sellTicket()结果是false就关闭卖票的窗口了
//                break;
//            }
//            try {
//                //模拟当前窗口卖完出票需要5毫秒时间
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }

    //保证某个线程调用此方法的时候，其他的线程无法调用此方法，必须等该线程释放锁其他线程才能有机会调用
//    public synchronized boolean sellTicket(){
//        //判断是否有票
//        if (ticket > 0) {
//            //获取正在‘卖票的窗口‘
//            String name = Thread.currentThread().getName();
//            System.out.println(name + "正在卖：" + ticket);
//            ticket--; // 卖完，票减一
//        } else {
//            //票卖完了返回false
//            return  false;
//        }
//        return true;
//    }

    @Override
    public void run() {
        //卖票窗口一直开启
        while (true) {
            //保证某个窗口在进行卖票的时候，其他的窗口无法卖次张票
            lock.lock();
                //判断是否有票
                if (ticket > 0) {
                    //获取正在‘卖票的窗口‘
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "正在卖：" + ticket);
                    ticket--; // 卖完，票减一
                } else {
                    //票卖完了就关闭这个窗口
                    lock.unlock();
                    break;
                }
                
            lock.unlock();
            try {
                //模拟当前窗口卖完出票需要5毫秒时间
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
