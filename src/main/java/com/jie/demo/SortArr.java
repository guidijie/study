package com.jie.demo;

public class SortArr {

    public static void main(String[] args) {

        int[] arr = {10,60,60,98,45,61,37,62};
        int temp, num;

        //选择排序
        for (int i = 0;i<arr.length;i++){
            num = i;  //把arr的0号下标给num
            for(int j= i+1;j < arr.length;j++){
                if(arr[num]<arr[j]){  //挨个遍历arr的所有元素然后判断小于arr的num元素吗
                    num=j;  //小于把num的值替换为j的值
                }
            }
            if(num!=i){   //判断num的值不等于如果不等于的话，那么就把arr[num]的值和arr[i]的值交换位置
                temp = arr[i];
                arr[i] = arr[num];
                arr[num] = temp;
            }
        }

        //冒泡排序
//        for (int i = 0;i<arr.length;i++){
//            for(int j= i+1;j < arr.length;j++){
//                if(arr[i]<arr[j]){
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//
//        }
        for(int i : arr){
            System.out.println(i);
        }
    }
}
