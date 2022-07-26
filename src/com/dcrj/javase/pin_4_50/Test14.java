package com.dcrj.javase.pin_4_50;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 给定两个排好序的数组，合并它们并求中位数
 * */
public class Test14 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        double res = 0.0;
        for(var e:nums1){
            list.add(e);
        }
        for(var e:nums2) {
            list.add(e);
        }
        Collections.sort(list);
        if(list.size()%2==0){
           res = 0.5*(list.get(list.size()/2)+list.get(list.size()/2-1));
        }
        if(list.size()%2!=0){
            res = list.get(list.size()/2);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2};
        System.out.println(findMedianSortedArrays(arr1, arr2));
    }
}
