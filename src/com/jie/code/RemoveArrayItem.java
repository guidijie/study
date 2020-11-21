package com.jie.code;

import java.util.ArrayList;
import java.util.List;

public class RemoveArrayItem {

    /**
     * 移除元素
     * */
    public static int removeElement(int[] nums, int val) {
        List<Integer> arr = new ArrayList();
        int con = 0;
        for (int num:nums) {
            if(num != val){
                arr.add(num);
                nums[con] = arr.get(con);
                con++;
            }
        }
        return arr.size();
    }

    public static void main(String[] args) {
        int[] a = {0,1,2,2,3,0,4,2};
        RemoveArrayItem.removeElement(a ,2);

    }
}
