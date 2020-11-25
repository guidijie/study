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
        //创建map集合，用于存储分组后的list集合对象
        Map<String, List<Student>> map1 = new HashMap<>();
        Map<String, List<Student>> map2 = new HashMap<>();

        //实例化对象
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

        //将实例化对象添加到list集合中
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        //打印未分组的list

        System.out.println("未分组前的集合");
        System.out.println(list);
        System.out.println("=============================");
        System.out.println();


        System.out.println("第一种分组方法");
        //使用第一种分组的办法
        map1 = groupingArrayListOne(list);
        //遍历分组后的map1
        traverseMap(map1);

        System.out.println("=============================");

        System.out.println("第二种分组方法");
        //使用第二种分组的办法
        map2 = groupingArrayListTwo(list);
        //遍历分组后的map2
        traverseMap(map2);
    }

    //第一种分组的方法
    public static Map<String, List<Student>> groupingArrayListOne(List<Student> list){
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
        return map;
    }

    //第二种分组的方法
    public static Map<String, List<Student>> groupingArrayListTwo(List<Student> list){

        //使用jdk8的流式编程对list集合进行分组
        Map<String, List<Student>> listMap = list.stream().collect(Collectors.groupingBy(t -> t.getType()));
        return listMap;

    }

    //遍历Map集合
    public static void traverseMap(Map<String,List<Student>> map){
        for (String s:map.keySet()){
            System.out.println(map.get(s));
        }
    }
}