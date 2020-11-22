package com.jie.single;

/**
 * 在内部类被加载和初始化时，才创建SINGLETON_6实例对象
 * 静态内部类不会自动随外部类的加载和初始化而初始化，他需要单独去加载和初始化
 * 应为是在内部类加载和初始化，创建的，因此线程是安全的
 * */
public class Singleton6 {

    private Singleton6(){

    }

    //静态内部类
    private static class Inner{
        private static final Singleton6 SINGLETON_6 = new Singleton6();
    }

    public static Singleton6 getInstance(){
        return Inner.SINGLETON_6;
    }

}
