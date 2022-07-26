/**  
 * @Title: Test08.java
 * @Description: TODO
 * @author pin
 * @date 2022-03-01 02+12:45:58 
 */  
package com.dcrj.javase.pin_4_50;

/**  
 * @ClassName: Test08
 * @Description: 打印一个菱形
 * @author pin
 * @date 2022-03-01 02:45:58 
 */

public class Test08 {

	/**  
	 * @Title: main
	 * @Description: TODO(描述)
	 * @param args
	 * @author pin
	 * @date 2022-03-01 02:45:58 
	 */

	public static void main(String[] args) {
		int num = 5;
		for(int i = 0 ;i<num;i++) {
			for(int j = num-i-1;j>0;j--) {
				System.out.print(" ");
			}
			for(int k = (num+i)*2-1;k>(num-1)*2;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0;i<num-1;i++) {
			for(int j = 0;j<i+1;j++) {
				System.out.print(" ");
			}
			for(int k = (num-1)*2-1;k>i*2;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
