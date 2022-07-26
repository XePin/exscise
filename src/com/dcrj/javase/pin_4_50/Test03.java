/**  
 * @Title: Test03.java
 * @Description: TODO
 * @author pin
 * @date 2022-02-25 04+12:01:35 
 */  
package com.dcrj.javase.pin_4_50;

/**  
 * @ClassName: Test03
 * @Description:打印出一个直角在右下的直角三角形底和高都是10
 * @author pin
 * @date 2022-02-25 04:01:35 
 * 打印出一个直角在右下的直角三角形底和高都是10
 */

public class Test03 {

	/**  
	 * @Title: main
	 * @Description: no
	 * @param args
	 * @author pin
	 * @date 2022-02-25 04:01:35 
	 */

	public static void main(String[] args) {
		for(int i = 0; i<10;i++) {
			for(int j = 0 ;j<10;j++) {
				while(j<9-i) {
					System.out.print("\0");
					j++;
				}//一行打印多少个空
				System.out.print("*");// 一行打印多少个*
			}
			System.out.println("\t");//换行
		}

	}

}
