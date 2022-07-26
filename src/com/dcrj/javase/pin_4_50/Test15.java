package com.dcrj.javase.pin_4_50;

import java.util.LinkedList;

public class Test15 {
    /**
     * 求两个数组的交集 可以不考虑顺序
     * @param nums1
     * @param nums2
     * @return int[]<br>
     * <p>先要确定新的数组的长度，遍历第一个数组与第二个数组比较，如果有相同的就标记这个数（改为负数）
     * 为了不要重复比较，同时标记另一个数组的数，最后遍历第一个数组将其中被标记的数拿出来<br>
     * 优化考虑:用长度小的数组与长度长的数组做比较 达不到目的<br>
     * 进阶:假设数组已经排好序了<p/>
     * */

    public static int[] intersect(int[] nums1, int[] nums2) {
        int len = 0;
        for(int i = 0;i<nums1.length;i++){
                for(int j = 0;j<nums2.length;j++){
                    if((nums1[i]^nums2[j])==0){
                        len++;
                        nums1[i] = 0 - nums1[i];
                        nums2[j] = 0 - nums2[j];
                        break;
                    }
                }
        }
        int[] res = new int[len];
        for (int i = 0,j = 0;i<nums1.length;i++){
            if(nums1[i]<0){
                res[j]= 0 - nums1[i];
                j++;
            }
        }
        return res;
    }
    /**
     * 将该数组的0移到最后，但不能改变其他数字的顺序
     * @param nums
     * */
    public static void moveZeroes(int[] nums) {
        LinkedList<Integer> list=new LinkedList<>();
        for(var i =0;i<nums.length;i++){
            if(nums[i]!=0){
                list.add(nums[i]);
                nums[i]=0;
            }
        }
        int len = list.size();
        for(var i =0;i<len;i++){
            nums[i]=list.removeFirst();
            System.out.println(nums[i]);
        }
    }
    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5,5};
        int[] a2 = {2,6,9,10,5,5};
        int[] intersect = intersect(a1, a2);
       for(var i:intersect){
           System.out.println(i);
       }
        System.out.println("------------------");
        moveZeroes(a1);

        System.out.println(27^3);

    }
}
