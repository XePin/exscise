/**  
 * @Title: Test02.java
 * @Description: TODO
 * @author pin
 * @date 2022-02-25 03+12:47:14 
 */  
package com.dcrj.javase.pin_4_50;

/**  
 * @ClassName: Test02
 * @Description: 打印出1000以内的所有水仙花数
 * @author pin
 * @date 2022-02-25 03:47:14 
 * 打印出1000以内的所有水仙花数
 */

public class Test02 {

	/**  
	 * @Title: main
	 * @Description: no
	 * @param args
	 * @author pin
	 * @date 2022-02-25 03:47:14  
	 * 123%100 =23/10=2 123%10=3
	 */

	public static void main(String[] args) {
		for(int i = 100;i<1000;i++) {
			int a = i/100;
			int b = i%100/10;
			int c = i%10;
			if(i==(a*a*a+b*b*b+c*c*c)) {
				System.out.println(i);
			}
		}

	}

}
