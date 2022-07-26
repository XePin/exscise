package com.dcrj.javase.pin_10_letcote;

import java.util.HashSet;
import java.util.TreeSet;
/**
 *数组练习
 * */

public class Test01_Array {
    /**
     * 去除数组中的重复元素
     * @param nums 原数组
     * @return  返回不重复的元素的个数
     * */
    public static int removeDuplicates(int[] nums) {
        TreeSet<Integer> hs = new TreeSet<>();
        for(var i:nums){
            hs.add(i);
        }
        int res = hs.size();
       for(var i = 0;i<res;i++){
           nums[i] = hs.pollFirst();
       }
        return res;
    }
    /**
     * 以改数组为股票日K线求最大利润
     * @param prices
     * @return 最大利润值
     * */
    public  static  int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }
        int max = 0;
        for(var i = 0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                max = max +prices[i+1]-prices[i];
            }
        }
        return  max;
    }
    /**
     * 操作该数组向右滚 k位
     * @param nums
     * @param k
     * */
    public  static void rotate(int[] nums, int k) {
        int[] clone = nums.clone();
        for(var i = 0 ;i<nums.length;i++){
            nums[(i+k)%nums.length] = clone[i];
        }
    }

   /**
    * 有重复的就返回 true
    * @param nums
    * @return
    * */
    public boolean containsDuplicate(int[] nums) {
        boolean res = false;
        HashSet<Integer> hs = new HashSet<>();
        for(var e: nums){
            if(!hs.add(e)){
                res = true;
                break;
            }
        }
        return res;
    }
    /**
     * 找到那个不重复的数
     * @param  nums
     * @return
     *
     * */
    public int singleNumber(int[] nums) {
    /*    HashSet<Integer> hs = new HashSet<>();
        for(var e : nums){
            if(!hs.add(e)){
                hs.remove(e);
            }
        }
        return (int)hs.toArray()[0];
     */
        int res = 0 ;
        for(var e :nums){
            res = res^e;
        }
        return res;
    }
}
