/**  
 * @Title: SortDemo.java
 * @Description: TODO
 * @author pin
 * @date 2022-02-23 04+12:43:34 
 */  
package com.dcrj.javase.pin_1_Sort;

/**  
 * @ClassName: SortDemo
 * @Description: TODO none
 * @author pin
 * @date 2022-02-23 04:43:34 
 * 这是一个冒泡排序方法的测试
 * 相邻数据进行比较把大的放在后面
 */

public class SortDemo {

	/**  
	 * @Title: main
	 * @Description:  none
	 * @param args
	 * @author pin
	 * @date 2022-02-23 04:43:34 
	 */

	public static void main(String[] args) {
		int [] arr = new int [] {21,3,41,45,67,2,78,6};
		for(int j = 0;j<arr.length;j++) {
			for(int i = 0; i<arr.length-1-i;i++) {
					if(arr[i]>arr[i+1]) {
						int temp=arr[i];
						arr[i]=arr[i+1];
						arr[i+1]=temp;
					}
			}
		}
		for(int i:arr) {
			System.out.println(i);
		}
	}

}
