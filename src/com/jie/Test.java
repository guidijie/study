package com.jie;

import com.jie.demo.PersonEnum;
class a{
    protected final void getInfo(){
        System.out.println("a");
    }
}
public class Test {
    int a = test();
    public static void main(String[] args) {
//        try {
//            String text = "199";
//            double d = Double.parseDouble(text);
//            text = Double.toString(d);
//            int i = (int)Double.valueOf(text).doubleValue();
//            System.out.println(i);
//        } catch (NumberFormatException e) {
//            System.out.println("错误");
//        }

//        String str1 = "ABCDEFG",str2 = "";
//        str1 = str2 = str1.replace("A","Z");
//        System.out.println(str1 + "   " + str2);
        a as = new a();
        as.getInfo();

    }

    protected final void getInfo(){
        System.out.println("b");
    }
    public int test(){
        return 1;
    }
}
