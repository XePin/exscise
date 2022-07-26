/**  
 * @Title: InsertSort.java
 * @Description: TODO
 * @author pin
 * @date 2022-03-02 03+12:42:47 
 */  
package com.dcrj.javase.pin_1_Sort;

/**  
 * @ClassName: InsertSort
 * @Description: 直接插入法
 * @author pin
 * @date 2022-03-02 03:42:47 
 * {26,58,11,57,2,9,84}
 *  (26) 58 11 57 2 9 84
 *  (26 58) 11 57 2 9 84
 *  (11 26 58) 57 2 9 84
 *  (11 26 57 58) 2 9 84
 *  (2 11 26 57 58) 9 84
 *  (2 9 11 26 57 58 )84
 *  (2 9 11 26 57 58 84)
 */

public class InsertSort {

	/**  
	 * @Title: main
	 * @Description: TODO(描述)
	 * @param args
	 * @author pin
	 * @date 2022-03-02 03:42:47 
	 */

	public static void main(String[] args) {
		int [] arr = {58,26,11,57,2,9,84};
		for(int i = 1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				int temp = arr[i];
				arr[i] = arr[i-1];
				int j = i-2;
				for(;j>=0&&(temp<arr[j]);j--) {
					arr[j+1] = arr[j];
				}
				arr[j+1] = temp;
			}
		}
		for(int i:arr) {
			System.out.println(i);
		}
		

	}

}
