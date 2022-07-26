/**  
 * @Title: Test05.java
 * @Description: TODO
 * @author pin
 * @date 2022-02-25 05+12:52:53 
 */  
package com.dcrj.javase.pin_4_50;

/**  
 * @ClassName: Test05
 * @Description: 输入100以内的素数
 * @author pin
 * @date 2022-02-25 05:52:53 
 * 输入100以内的素数  
 */

public class Test05 {
	public static void main(String[] args) {
		int mark = 1;
		for(int i = 1;i<100;i++) {
			for(int j = 2;j<i;j++) {
				if(i%j==0) {
				mark = 0;
				break;
				}
			}
			if(mark==1) {
				System.out.println(i);
			}
			mark = 1;
		}
	}
}
