package com.jie;

import lombok.Data;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Data
class Student {
    private String name;
    private int age;
    private String type;
}

public class GroupingArray {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(19);
        s1.setType("A");
        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(12);
        s2.setType("A");
        Student s3 = new Student();
        s3.setName("王五");
        s3.setAge(22);
        s3.setType("A");
        Student s4 = new Student();
        s4.setName("小明");
        s4.setAge(12);
        s4.setType("B");
        Student s5 = new Student();
        s5.setName("小红");
        s5.setAge(12);
        s5.setType("B");

        //添加到list集合中
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        //打印未分组的list
        System.out.println(list);

        //创建map集合，用于存储分组后的list集合对象
        Map<String, List<Student>> map = new HashMap<>();
        //分组
        for (Student l:list){
            if (map.containsKey(l.getType())) {  //判断是否存在该key
                map.get(l.getType()).add(l);   //存在就获取该key的value然后add
            } else {
                List<Student> lt = new ArrayList<>();
                lt.add(l);
                map.put(l.getType(), lt);  //不存在就put
            }
        }

        for (String s:map.keySet()){
            System.out.println(map.get(s));
        }

        //使用jdk8的流式编程对list集合进行分组
//        Map<String,List<Student>> m = list.stream().collect(Collectors.groupingBy(t -> t.getType()));
//        List<Student> list1 = m.get("A");
//        List<Student> list2 = m.get("B");
//
//        System.out.println(list1);
//        System.out.println(list2);


    }
}
