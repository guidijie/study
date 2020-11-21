package com.jie.code;

public class Solution {

    public static int reverse(int x) {
        if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
            return 0;
        } else {
            String s = x + "";
            if (s.startsWith("-")) {
                String replace = s.replace("-", "");
                String reverse = new StringBuffer(replace).reverse().toString();
                String s1 = "-";
                s1 += reverse;
                try {
                    int parseInt = Integer.parseInt(s1);
                    System.out.println(parseInt);
                    return parseInt;
                }catch (NumberFormatException e){
                    return 0;
                }
            } else {
                String reverse = new StringBuffer(s).reverse().toString();
                try {
                    int parseInt = Integer.parseInt(reverse);
                    System.out.println(parseInt);
                    return parseInt;
                }catch (NumberFormatException e){
                    return 0;
                }

            }
        }
    }

    public static void main(String[] args) {
        int reverse = Solution.reverse(45560);
    }
}
