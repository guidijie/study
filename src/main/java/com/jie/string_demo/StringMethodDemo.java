package com.jie.string_demo;

public class StringMethodDemo {

    /*
        public char charAt(int index);	返回指定索引处的char值
        public String concat(String str);  将指定字符串连接到该字符串的末尾
        public int indexOf(String str);  返回指定字符串出现在该字符串第一次出现的索引
        public int length();   返回该字符串的长度
        public boolean isEmpty();   判断是否为空，为true相当于length() 等于0
        public String replace(CharSequence target, CharSequence replacement);    替换指定的字符串
        public String[] split(String regex);	按照指定字符串切割，返回切割后的字符串数组
        public String subString(int beginIndex);   从索引位置截取字符串后面所有的内容，包前
        public String subString(int beginIndex,int endIndex);    按照开始索引截取字符串结束索引位置，包前不包后
        public char[] toCharArray();  将字符串转换为char数组
        public String toLowerCase();  将字符串转换为小写
        public String toUpperCase()  将字符串转换为大写
        public String trim();  去除该字符串的前后空格
        public static String valueOf(int i);    将指定类型转换为String
        public boolean equals(Object anObject)   比较字符串的内容，严格区分大小写
        public boolean equalsIgnoreCase(Object anObject)   比较字符串的内容，不区分大小写
    */

    public static void main(String[] args) {

        String str = "HelloWorld";

        //charAt   返回指定索引处的char值
        char c = str.charAt(1);   //返回1索引处的char值
        System.out.println(c);  //输出 e  刚好对应str1字符串的1索引位置

        //concat  将指定字符串连接到该字符串的末尾
        String concat = str.concat(",haha"); //将指定字符串 “,haha” 连接到该字符串的末尾
        System.out.println(concat);  //输出  HelloWorld,haha

        //indexOf  返回指定字符串出现在该字符串第一次出现的索引
        int i = str.indexOf("W");  //查找字符串“W”出现在该字符串第一次出现的索引
        System.out.println(i);  //输出 5
        int i2 = str.indexOf("Hello");  //查找字符串“Hello”出现在该字符串第一次出现的索引
        System.out.println(i2);  //输出 0   “Hello”在str字符串中出现的第一次位置就是0索引

        //length  返回该字符串的长度
        System.out.println(str.length());  //输出 10  获取str字符串的长度

        //isEmpty  判断是否为空，为true相当于length() 等于0
        boolean empty = str.isEmpty();   //判断str字符串是否为空
        System.out.println(empty);  //输出 false  不是空的
        String xx = new String();
        System.out.println(xx.isEmpty());  //输出  true  这是一个空字符串

        //replace  替换指定的字符串
        String s = "aBc";
        String replace = s.replace("B", "b");   //用指定的字符串“b”替换该字符串里面的“B”
        System.out.println(replace);  //输出结果  abc

        //split  按照指定字符串切割，返回切割后的字符串数组
        String s2 = "AA,BB,CC";
        String[] split = s2.split(",");  //按照“，”切割字符串
        //遍历切割后的字符串数组
        for(String st:split){
            System.out.println(st);
        }

        //subString(一个参数)  从索引位置截取字符串后面所有的内容，包前
        String substring = str.substring(5);
        System.out.println(substring);  //输出 World

        //subString(两个参数)  按照开始索引截取字符串结束索引位置，包前不包后
        String substring2 = str.substring(0,5);  //从索引0开始截取，截取到第5索引，但是不包括5索引位置的元素
        System.out.println(substring2);  //输出 Hello

        //toCharArray  将字符串转换为char数组
        char[] chars = str.toCharArray();//将str转换为char型数组
        //遍历转换后的char型数组
        for(char c2 : chars){
            System.out.println(c2);
        }

        //toLowerCase  将字符串转换为小写
        String s3 = "ABC";
        String lowerCase = s3.toLowerCase();
        System.out.println(lowerCase);  //输出结果  abc

        //toUpperCase  将字符串转换为大写
        String s4 = "abc";
        String upperCase = s3.toUpperCase();
        System.out.println(upperCase);  //输出结果  ABC


        //trim  去除该字符串的前后空格
        String s5 = "     哈哈       ";
        System.out.println("没有去除前后空格前：" + s5);  //输出：没有去除前后空格前：     哈哈
        String trim = s5.trim();
        System.out.println("没有去除前后空格前：" + trim);  //输出：没有去除前后空格前：哈哈

        //valueOf 这是静态方法   将指定类型转换为String
        String v1 = String.valueOf(10);  //将int转为字符串
        System.out.println(v1);
        System.out.println(v1 instanceof String);  //判断是否是String类型  true

        String v2 = String.valueOf(10.01);  //将double转为字符串
        System.out.println(v2);
        System.out.println(v1 instanceof String);  //判断是否是String类型  true
        //...


        //equals   比较字符串的内容，严格区分大小写
        String e1 = "AAA";
        String e2 = "aaa";
        String e3 = "AAA";
        System.out.println(e1 == e2);  //false  双等号比较的是地址值
        System.out.println(e1.equals(e2));  //false
        System.out.println(e1.equals(e3));  //true

        //equalsIgnoreCase   比较字符串的内容，不区分大小写
        System.out.println(e1.equalsIgnoreCase(e2));  //true
        System.out.println(e1.equalsIgnoreCase(e3));  //true
    }


}
