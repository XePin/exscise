/**  
 * @Title: PubblingSort.java
 * @Description: TODO
 * @author pin
 * @date 2022-03-03 02+12:26:32 
 */  
package com.dcrj.javase.pin_1_Sort;

/**  
 * @ClassName: PubblingSort
 * @Description: 冒泡排序
 * @author pin
 * @date 2022-03-03 02:26:32 
 * //改进方法：每一次冒泡出一个最大值无需再进行比较
 */

public class PubblingSort {

	public static void main(String[] args) {
		int[] arr = {23,24,5,90,128,66,54};
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr.length-1-i;j++) {//改进方法：此处-i
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(var i:arr) {
			System.out.println(i);
		}
	}

}
