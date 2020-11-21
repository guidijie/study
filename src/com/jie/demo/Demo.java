package com.jie.demo;

import java.util.*;

public class Demo {

    public Demo() {
    }

    public static void main(String[] args) {

//        for(int i = 1; i<=9;i++){
//            for(int j = 1;j<=i;j++){
//                System.out.print(j + "*" +  i + "=" + (j*i) + "  ");
//            }
//            System.out.println("");
//        }

//        for(int i = 1; i<=9;i++){
//            for(int j = i;j<=9;j++){
//                System.out.print(i + "*" +  j + "=" + (j*i) + "     ");
//            }
//            System.out.println("");
//        }
        Map<String,String> map = new HashMap<>();
        map.put("one","小明");
        map.put("two","小红");
        map.put("three","小丽");
        map.put("four","小王");

        //第一种方法遍历map集合
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.stream().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            System.out.print(next.getKey());
            System.out.println("  "+next.getValue());
        }

        System.out.println("==================================");

        //第二种方法遍历map集合
        for(String s:map.keySet()){
            System.out.println(map.get(s));
        }

        //这是单行注释
        System.out.println("单行注释");

        /*
            这是多行注释
            我可以写多行哦
            ...
        */
        System.out.println("多行注释");

        /**
         *我是文档注释
         * */
        System.out.println("文档注释");

        /*
         * 变量的定义
         *   修饰符(可不写) 数据类型 变量名 = 初始值
         * 变量的使用
         *   直接使用变量名
         * 变量命名规则：
         *   以字母数据下划线$符号组成，以字母下划线$开头，不能是关键字，区分大小写
         * 变量命名规范：
         *   小驼峰方式命名，单词首字母小写，后面的单词首字母大写，名字需要见名知意
         * 注意：
         *   同一作用域范围类的变量不能重名
         *   变量的值不能超过它数据类型的范围
         *
         * */


        //定义一个int类型的变量并为它赋初始值为10
        int a = 10;
        System.out.println(a); //输出这个变量
        a = 20;  //修改a的值为20

        //定义一个byte类型的变量并为它赋初始值为10，赋值的时候需要注意不能超过byte的范围，否则或报错
        byte b = 10;
        System.out.println(b); //输出这个变量
        b = 20;  //修改a的值为20

        //定义一个short类型的变量并为它赋初始值为10，赋值的时候需要注意不能超过short的范围，否则或报错
        short c = 10;
        System.out.println(c); //输出这个变量
        c = 20;  //修改a的值为20

        //定义一个long类型的变量并为它赋初始值为10
        long l = 10l;       //这里需要注意的是，需要在10的后面加一个l或者L，用于区分
        System.out.println(l); //输出这个变量
        l = 20L;

        //定义float类型的变量赋值为10
        float d = 10.1f;     //这里需要注意的是，需要在10的后面加一个f或者F,否则会报错
        System.out.println(d); //输出这个变量
        d = 20.4F;  //修改值为20.4

        //定义double类型的变量赋值为10
        double e = 92.15;
        System.out.println(e); //输出这个变量
        e = 10.45;  //修改值为10.45

        //定义一个char类型的变量并为它赋初始值为 'A'
        char car = 'A';
        System.out.println(car); //输出这个变量
        car = 'B'; //修改car的值为'B'

        //定义一个布尔类型的变量并为它赋初始值为false
        boolean isTrue = false;
        System.out.println(isTrue); //输出这个变量
        isTrue = true; //修改isTrue的值为true

        System.out.println("==========");
        short b3 = 10;
        int b4 = 10;
        b3 += b4;  //这里底层自动的强制类型转换成为了short，其他依次类推
        System.out.println(b3);


        int d1 = 10,d2 = 20;
        System.out.println(d1 < d2);       //10小于20  结果为true
        System.out.println(d1 > d2);        //10不大于20  结果为false
        System.out.println(d1 <= d2);       //10小于20  结果为true
        System.out.println(d1 >= d2);       //10不大于20  结果为false
        System.out.println(d1 != d2);       //10不等于20  结果为true
        System.out.println(d1 == d2);       //10不等于20  结果为false

        if(d1>9 | d2>0){
            System.out.println("hah");
        }

        int i = 1;
        int j = ++i + ++i + i++ + ++i; //2 3 3 5
        System.out.println(j);

        Scanner sc = new Scanner(System.in);
        //小明考试奖励
        System.out.println("请输入小明的成绩：");
        int score = sc.nextInt();
        if(score  >= 95 && score <= 100 ){
            System.out.println("小明考了"+ score +"分，获得山地自行车一辆");
        }else if(score  >= 90 && score <= 94){
            System.out.println("小明考了"+ score +"分，游乐场玩一次");
        }else if(score  >= 80 && score <= 89){
            System.out.println("小明考了"+ score +"分，获得变形金刚玩具一个");
        }else if(score < 80){
            System.out.println("胖揍一顿");
        }else{
            System.out.println("输入有误");
        }




    }
}
