/**  
 * @Title: Test07.java
 * @Description: TODO
 * @author pin
 * @date 2022-02-28 11+12:04:23 
 */  
package com.dcrj.javase.pin_4_50;

import java.util.Scanner;

/**  
 * @ClassName: Test07
 * @Description:none
 * @author pin
 * @date 2022-02-28 11:04:23 
 */

public class Test07 {

	/**  
	 * @Title: main
	 * @Description:求一个数的阶乘
	 * @param args
	 * @author pin
	 * @date 2022-02-28 11:04:23 
	 * 求一个数的阶乘 递归方法
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int i = sc.nextInt();
		System.out.println(factorial(i));
	}
	public static long factorial(int n) {
		long l = 1;
		if(n>1) {
			l = n*factorial(n-1);
		}
		return l;
	}

}
