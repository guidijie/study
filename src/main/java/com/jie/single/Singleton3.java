package com.jie.single;

import java.io.IOException;
import java.util.Properties;

public class Singleton3 {

    public final static Singleton3 SINGLETON;
    private String info;

    /**
     * 静态代码块和直接实例化一样，只不过把创建单例对象从直接new转到了在静态代码块里面new了
     * 一般使用静态代码块的方式实现单例都是在静态代码块里面为成员属性赋上一些初值
     * 而且使用properties配置文件设置初始值，方便更改值，不需要动代码
     * */
    static{
        Properties properties = new Properties();
        try {
            //加载src下面的singleton-args.properties配置文件
            properties.load(Singleton3.class.getClassLoader().getResourceAsStream("singleton-args.properties"));
        } catch (IOException e) {
            System.out.println("遇见了错误");
        }
        //在创建实例对象的时候获取配置文件里面的info属性并为成员属性info赋值
        SINGLETON = new Singleton3(properties.getProperty("info"));
    }

    private Singleton3(String info){
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
