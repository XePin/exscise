package com.dcrj.javase.pin_1_Sort;
/**
 * 这是一个选择排序
 * 嵌套循环的第一次
 * 第一次循环 a0 与a0 比较 必然是false，多余操作
 * 第二次循环 a0=21,a1=3 a0>a1(true), temp=a1=3,a1=a0=21,a0=temp=3
 * 第三次循环 a0=3,a2=41 a0>a2(false)
 * 第四次循环 a0=3,a3=45 a0>a3(false)
 * ................................
 * 直到 a0=2 a5=3(这个数组中最小的数)为止
 * -----------------------------------
 * 嵌套循环的第二次{2,21,45,67,3,78,6}
 * 第一次循环 a1=21,a0=2 a1>a0(true) , 会交换值，排序逻辑出错的地方,不应该再进行比较 
 * 第二次循环 a1 与 a1 
 * 第三次循环 a1=21 a2=45
 * ...............................
 * -----------------------------------
 * 问题改进：
 * k=i+1可以解决问题,没必要当前序列的值再与前面的值进行比较
 * 最后一个序列的值无须再比较i<arr.length-1
 * */
public class SelectionSortDemo {
	public static void main(String[] args) {
    int [] arr = new int [] {21,3,41,45,67,2,78,6};
    //进行排序  由小到大
    for(int i = 0;i<arr.length-1;i++){
        for(int k = i+1;k<arr.length ;k++){
            if(arr[i] > arr[k]){
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
            }
        }
    }
    for(int i:arr) {
    	System.out.println(i);}
    }
}