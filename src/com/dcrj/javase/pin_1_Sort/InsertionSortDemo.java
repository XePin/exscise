/**  
 * @Title: InsertionSortDemo.java
 * @Description: TODO
 * @author pin
 * @date 2022-02-23 04+12:57:31 
 */  
package com.dcrj.javase.pin_1_Sort;

/**  
 * @ClassName: InsertionSortDemo
 * @Description: TODO 未完成
 * @author pin
 * @date 2022-02-23 04:57:31 
 * 这是一个插入排序的测试
 */

public class InsertionSortDemo {

	/**  
	 * @Title: main
	 * @Description: TODO(描述)
	 * @param args
	 * @author pin
	 * @date 2022-02-23 04:57:31 
	 * 
	 */

	public static void main(String[] args) {
        int [] arr = new int [] {21,3,41,45,67,2,78,6};

        for(int i = 0;i < arr.length-1;i++){
            //当前准备比较的值
            int temp  = arr[i+1];//i=0 temp=a1=3
             int num = i;//num=0
           //当前位置的值和前面所有的值比较进行换位
           while(num >= 0 && temp < arr[num] ){
               arr[num + 1] = arr[num ];
                num --;//(0>=0 && 3<21)(true) a1=a0=21
           }
           arr[num + 1] = temp;
        }
        for (int k : arr) {
            System.out.println(k);
        }
    }

}
