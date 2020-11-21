package com.jie.code;

public class RotationArray {

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[][] result = rotationArray(arr);

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("=================");

        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
                System.out.print(result[i][j] + "  ");
            }
            System.out.println();
        }

    }

    public static int[][] rotationArray(int[][] arr){
        int[][] result  = new int[arr[0].length][arr.length];
        int num = 0;
        for(int i=0;i<arr.length;i++,num++){
            for(int j= arr[0].length-1, k = 0;j>=0;j--,k++){
                result[k][num] =  arr[i][j];
            }
        }
        return result;
    }
}
