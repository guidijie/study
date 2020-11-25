package com.jie.string_demo;

public class StringConstructor {

    public static void main(String[] args) {

        //String s = “abc”; 直接赋值的方式创建字符串对象，内容就是abc
        String str1 = "abc"; System.out.println("str1:" + str1);

        //public String();   创建一个空白字符串对象，不含有任何内容
        String str2 = new String();
        System.out.println("str2:" + str2);  //这里是空的

        //public String(char[] chs);   根据字符数组的内容，来创建字符串对象
        char[] chs = {'h', 'e', 'l', 'l', 'o'};
        String str3 = new String(chs);
        System.out.println("str3:" + str3);

        //public String(byte[] bys);   根据字节数组的内容，来创建字符串对象
        byte[] bys = {97, 98, 99};
        String str4 = new String(bys);
        System.out.println("str4:" + str4);

        String s = str1.valueOf(1);
        System.out.println(s instanceof String);

    }
}
