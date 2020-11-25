package com.jie.demo;


import java.util.Random;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {


//        Scanner sc = new Scanner(System.in);
//        for (; ; ) {
//            System.out.println("请输入你要猜的数字");
//            int cai = sc.nextInt();
//            if (cai > num) {
//                System.out.println("你猜大了");
//            } else if (cai < num) {
//                System.out.println("你猜小了");
//            } else {
//                System.out.println("恭喜你猜对了");
//                break;
//            }
//        }

//        for(int i = 1;i<=5;i++){
//            System.out.println(i);
//        }
//        System.out.println("==========");
//        for(int i = 5;i>=1;i--){
//            System.out.println(i);
//        }

//        int sum = 0;
//        for(int i = 1;i<=5;i++){
//            sum += i;
//        }
//        System.out.println("1+2+...+5的结果为：" +sum);

//        int sum = 0;
//        for(int i = 1;i<=100;i++){
//            if(i%2 == 0){
//                sum += i;
//            }
//        }
//        System.out.println("100以内的偶数和为：" +sum);

        //在控制台输出所有的“水仙花数” 水仙花数，指的是一个三位数，个位、十位、百位的数字立方和等于原数
//        for(int i = 100;i<1000;i++){
//            int ge = i % 10 ;
//            int shi = i/10%10;
//            int bai = i /100;
//            if((ge*ge*ge) + (shi*shi*shi) + (bai*bai*bai) == i ){
//                System.out.println(i);
//            }
//        }
//
//        int num = 0;
//        for(int i = 100;i<1000;i++){
//            int ge = i % 10 ;
//            int shi = i/10%10;
//            int bai = i /100;
//            if((ge*ge*ge) + (shi*shi*shi) + (bai*bai*bai) == i ){
//                num++;
//            }
//        }
//        System.out.println("100~1000之间中的水仙花数有："+ num +"个");

//        double width = 0.1;
//        int count = 0;
//        while(width <= 8844430){
//            width *= 2;
//            count++;
//        }
//        System.out.println(count);

//        for(int i = 0;i<12;i++){
//            for(int j = 1;j<=60;j++){
//                System.out.println("现在是"+i+"小时"+j+"分");
//            }
//        }

//        Random r = new Random();
//        for (;;){
//            int a = r.nextInt(10);
//            System.out.println(a);
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("猜数的范围在1~100之间");
//        int num = (int)(Math.random() *100 +1);
//        for (; ; ) {
//            System.out.println("请输入你要猜的数字");
//            int cai = sc.nextInt();
//            if (cai > num) {
//                System.out.println("你猜大了");
//            } else if (cai < num) {
//                System.out.println("你猜小了");
//            } else {
//                System.out.println("恭喜你猜对了");
//                break;
//            }
//        }

//        for(String s: args){
//            System.out.println(s);
//        }



         /*
            按要求在main方法中完成以下功能：
            定义一个长度为5的int型数组arr，提示用户输入5个1-60之间的数字作为数组元素/
            生成2-10（范围包含2和10）之间的随机数num，遍历数组arr,筛选出数组中不是num倍数的元素并输出
            PS：输入的数组元素范围包括1和60，不需要代码判断
          */
        Scanner s = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("请输入5个1-60之间的数字:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("请输入第"+ (i+1) +"个数:");
            arr[i] = s.nextInt();
        }
        Random r = new Random();
        int num = r.nextInt(9) + 2;
        System.out.println(num);
        System.out.println("===");
        for (int i = 0; i < arr.length; i++) {
             if(arr[i] % num != 0){
                 System.out.println(arr[i]);
             }
        }
        
        

    }
}
