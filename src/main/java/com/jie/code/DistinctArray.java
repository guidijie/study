package com.jie.code;

import main.java.com.jie.demo.PersonEnum;

import java.util.ArrayList;
import java.util.List;

public class DistinctArray {

    /**
     * 删除排序数组中的重复项
     */
    public static int removeDuplicates(int[] nums) {  //nums =[1, 1, 2]
        List<Integer> arr = new ArrayList();
        int con = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!arr.contains(nums[i])) {
                arr.add(nums[i]);
                nums[con] = arr.get(con);
//                System.out.println(arr.get(i));
                con++;
            }
        }
        return arr.size();
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2};
        DistinctArray.removeDuplicates(a);

        System.out.println(PersonEnum.MAN.getType());
    }
}
