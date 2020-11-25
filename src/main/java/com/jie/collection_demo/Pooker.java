package com.jie.collection_demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;
import java.util.stream.Collectors;


public class Pooker {

    /** 组合牌
     * 定义一个Map集合用来存储牌号  和 牌
     * 定义一个List集合用来存储牌号
     * 花色:♥-♠-♦-♣ *   数字:2-A-K-Q-J-10-9-8-7-6-5-4-3
     * 洗牌
     * Collections.shuffle(牌号集合)
     * 发牌
     * 三个玩家三个集合
     * 发牌号
     * 排序
     * 看牌
     */

    static Map<Integer,String> pookerMap = new HashMap<>();
    static List<Integer> mapIndex = new ArrayList<>();

    static String[]  split1 = "♥-♠-♦-♣".split("-");
    static String[] split2 = "2-A-K-Q-J-10-9-8-7-6-5-4-3".split("-");



    public static void main(String[] args) {

        groupPooker();  //创建54张牌


        shufflePooker();  //洗牌


        //发牌
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Integer> dipai = new ArrayList<>();
        issuing(list1,list2,list3,dipai);

        //开始游戏
        watch("张三",list1);
        watch("李四",list2);
        watch("王五",list3);
        watch("底牌",dipai);



    }

    //创建牌
    public static void groupPooker(){
        int index = 2;
        for(String s1 : split1){
            for(String s2 : split2){
                String str = s1 + s2;
                pookerMap.put(index,str);
                mapIndex.add(index);
                index++;
            }
        }
        pookerMap.put(0,"大王");
        pookerMap.put(1,"小王");
        mapIndex.add(0);
        mapIndex.add(1);
    }

    //洗牌
    public static void shufflePooker(){
        Collections.shuffle(mapIndex);
    }

    //发牌
    public static void issuing(List<Integer> list1,List<Integer> list2,List<Integer> list3,List<Integer> dipai){
        for(int i = 0; i<mapIndex.size();i++){
            int item = mapIndex.get(i);
            if(i >= 51){
                dipai.add(item);
            }else if(i%3 == 0){
                list1.add(item);
            }else if(i%3 == 1){
                list2.add(item);
            }else if(i%3 == 2){
                list3.add(item);
            }
        }
    }

    //看牌
    public static void watch(String name ,List<Integer> list){
        Collections.sort(list);
        System.out.print(name + "：");
        for(int i =0;i<list.size();i++){
            if(i == list.size()-1){
                System.out.print(pookerMap.get(list.get(i)));
            }else{
                System.out.print(pookerMap.get(list.get(i)) + ", ");
            }
        }
        System.out.println();

    }
}
