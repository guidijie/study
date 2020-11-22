package com.jie.code;

public class SuShuDemo {

    public static void main(String[] args) {
        //质数又称素数。一个大于1的自然数，除了1和它自身外，不能被其他自然数整除的数叫做质数；否则称为合数。

        int suShu = 0 ;
        for (int i = 1;i<100000000;i++){
            System.out.println(i +"   "+SuShuDemo.getSuShu(i));
        }


    }

    static int getSuShu(int num){
        int suShu = 0;
        Boolean isBoolean = true;
        if(num != 1){
            for (int i = 2; i<num;i++){
                if ( num % i == 0){
                    int a = ++num;
                    int b = 0;
                    while(isBoolean){
                        for (int j = 2; j<a;j++){
                            if ( a % j == 0){
                                ++a;
                                break;
                            }else {
                                b = a;
                            }
                        }
                        if(a!=b){
                            continue;
                        }
                        suShu = a;
                        if(suShu != 0){
                            isBoolean= false;
                        }
                    }
                }
            }
            if (suShu != 0){
                return SuShuDemo.palindrome(suShu);
            }else {
                return SuShuDemo.palindrome(num);
            }

        }
        return 2;
    }

    public static long pow(int n){
        int m = 10;
        int result = 1;

        for(int i=0;i<n;i++){
            result *= m;

        }
        System.out.println("result  " + result);
        return result;
    }

    public static int palindrome(int num){
        String s = String.valueOf(num);
        int i = s.length();
        int j = 0;
        while (j <= (i / 2) -1 && s.charAt(j) == s.charAt(i - j - 1))
            j++;
        if (j == i / 2)
            return num;
        else{
            int jieguo = SuShuDemo.getSuShu(++num);
            return jieguo;
        }

    }
}
