package com.jie.single;

public class SingletonTest {

    public static void main(String[] args) throws Exception {

        //单例模式测试
//        Singleton1 s = Singleton1.SINGLETON;
//        Singleton1 s2 = Singleton1.SINGLETON;
//        System.out.println(s == s2);  // true


//        Singleton2 s2 = Singleton2.AA;
//        System.out.println(s2);  // true

//        Singleton3 s = Singleton3.SINGLETON;
//        System.out.println(s.getInfo());  //输出结果：aaa
//        Singleton3 s2 = Singleton3.SINGLETON;
//        System.out.println(s.getInfo());  //输出结果：aaa
//        System.out.println(s == s2);  //true



//        Singleton4[] s = new Singleton4[2];
//
//        Thread t1 = new Thread(() -> {
//            s[0] = Singleton4.getInstance();
//        });
//
//        Thread t2 = new Thread(() -> {
//            s[1] = Singleton4.getInstance();
//        });
//        t1.start();
//        t2.start();
//
//        //延迟8秒
//        try {
//            Thread.sleep(8000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        /*
//        *以下测试结果可能为true，多测试几次也会出现false，证明这个单例模式在多线程是不安全的
//        * */
//        System.out.println(s[0]);  //输出结果：com.jie.single.Singleton4@3d075dc0
//        System.out.println(s[1]);  //输出结果：com.jie.single.Singleton4@214c265e
//        System.out.println(s[0] == s[1]);  //输出结果：false


//        Singleton5[] s = new Singleton5[2];
//
//        Thread t1 = new Thread(() -> {
//            s[0] = Singleton5.getInstance();
//        });
//
//        Thread t2 = new Thread(() -> {
//            s[1] = Singleton5.getInstance();
//        });
//        t1.start();
//        t2.start();
//
//        //延迟8秒
//        try {
//            Thread.sleep(8000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        /*
//         *加了锁后的单例模式保证了多线程情况下不会出现new两个Singleton5对象
//         * */
//        System.out.println(s[0]);  //输出结果：com.jie.single.Singleton5@3d075dc0
//        System.out.println(s[1]);  //输出结果：com.jie.single.Singleton5@3d075dc0
//        System.out.println(s[0] == s[1]);  //输出结果：true

        Singleton6 s = Singleton6.getInstance();
        Singleton6 s2 = Singleton6.getInstance();
        System.out.println(s);  //输出结果：com.jie.single.Singleton6@1540e19d
        System.out.println(s2);  //输出结果：com.jie.single.Singleton6@1540e19d
        System.out.println(s == s2);  //输出结果：true

    }
}
