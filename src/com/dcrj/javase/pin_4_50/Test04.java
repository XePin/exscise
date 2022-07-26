/**  
 * @Title: Test04.java
 * @Description: TODO
 * @author pin
 * @date 2022-02-25 04+12:32:06 
 */  
package com.dcrj.javase.pin_4_50;

/**  
 * @ClassName: Test04
 * @Description: no
 * @author pin
 * @date 2022-02-25 04:32:06 
 */

public class Test04 {

	/**  
	 * @Title: main
	 * @Description: 打印出一个等腰三角形 底为10 高为10
	 * @param args
	 * @author pin
	 * @date 2022-02-25 04:32:06 
	 * 打印出一个等腰三角形 底为10 高为10
	 *
	 * 
	 *  总共需要 底*2多的格子
	 * 	1 2 3 4 5 6 7 8 9 A            5           *\0    9空前 8空后
	 * 	1 2 3 4 5 6 7 8 9 A	          5 6 		 *\0*\0   8空前 7空后
	 * 	1 2 3 4 5 6 7 8 9 A          5 6 7        
	 * 	1 2 3 4 5 6 7 8 9 A         4 5 6 7 
	 * 	1 2 3 4 5 6 7 8 9 A        3 4 5 6 7 
	 * 	1 2 3 4 5 6 7 8 9 A       3 4 5 6 7 8 
	 * 	1 2 3 4 5 6 7 8 9 A      2 3 4 5 6 7 8 
	 * 	1 2 3 4 5 6 7 8 9 A     2 3 4 5 6 7 8 9 
	 * 	1 2 3 4 5 6 7 8 9 A    2 3 4 5 6 7 8 9 A
	 * 	1 2 3 4 5 6 7 8 9 A   1 2 3 4 5 6 7 8 9 A 
	 */

	public static void main(String[] args) {
		for(int i = 0;i<10;i++) {
			for(int j = 0;j<(19-i*2)/2;j++) {
				System.out.print("\0");
			}
			for(int l = 0;l<i+1;l++) {
				System.out.print("*"+"\0");
				}
			for(int k = 0;k<((19-i*2)/2-1);k++) {
				System.out.print("\0");
			}
			System.out.println();
		}
	

	}

}
