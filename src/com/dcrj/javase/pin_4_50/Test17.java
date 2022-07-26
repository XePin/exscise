package com.dcrj.javase.pin_4_50;

import java.util.*;

public class Test17 {
    /**
     * 桶排序 <br>
     * 先要确定桶的长度 一般来说长度越长越好，但是相应地消耗空间越多
     * 就要当前数组的长度
     * 索引的计算方式为 var * len / max最接近的10^n
     * 所以要找到max
     * */
    public static int[] sort(int[] arr){
        int len = arr.length;
        int max = arr[0];
        for(int i = 1 ;i<len;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        int ground;
        int count = 0 ;
        do{
            max = max/10;
            count++;
        }while (max != 0);
        ground = (int) Math.pow(10,count);
        int index ;
        Object[] list = new Object[len];

        for(int i = 0;i<len;i++){
            index = arr[i]*len/ground;
            if(list[index]==null){
            LinkedList<Integer> link = new LinkedList<>();
            link.add(arr[i]);
            list[index] =link;
            }else {
                LinkedList<Integer> a = (LinkedList<Integer>) list[index];
                a.add(arr[i]);
            }
        }
        for(var e :list){
            if(e!=null){
            LinkedList<Integer> a = (LinkedList<Integer>) e;
            Collections.sort(a);
            a.forEach(System.out::println);
            }
        }
        return null;
    }

    public static void main(String[] args) {


        int[] arr = {63, 157, 189, 51, 101, 47, 141, 121, 157, 156, 999, 194, 117, 98, 139, 67, 133, 181, 13, 28, 109};
        sort(arr);

    }
}
