/**  
 * @Title: Test06.java
 * @Description: TODO
 * @author pin
 * @date 2022-02-28 10+12:39:50 
 */  
package com.dcrj.javase.pin_4_50;

import java.util.Scanner;

/**  
 * @ClassName: Test06
 * @Description: 未完成 
 * @author pin
 * @date 2022-02-28 10:39:50 
 * 输出一个
 * 222   33333
 * 212   32223
 * 222   32123
 *       32223
 *       33333
 */      

public class Test06 {

	/**  
	 * @Title: main
	 * @Description: TODO(描述)
	 * @param args
	 * @author pin
	 * @date 2022-02-28 10:39:51 
	 */
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = sc.nextInt();
		int[] arr = {};
		arr[0] = 1;
		
		for(int i = 0;i < a*2-1;i++) {
			System.out.print(a);
		}
	}

}
