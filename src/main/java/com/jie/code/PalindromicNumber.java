package com.jie.code;

import java.util.Scanner;

public class PalindromicNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(isPalindrome(i));

    }

    public static boolean isPalindrome(int x) {
        if (x >= 0) {
            int num1 = x;
            int num2 = 0;
            while (x != 0) {
                int a = x % 10;
                num2 = num2 * 10 + a;
                x = x / 10;
            }
            return num1 == num2;
        }
        return false;
    }

    public static boolean isPalindrome2(int x) {


        if (x >= 0) {
            String str2 = new StringBuilder(x + "").reverse().toString();
            try {
                int y = Integer.parseInt(str2);
                return x == y;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return false;

    }
}
