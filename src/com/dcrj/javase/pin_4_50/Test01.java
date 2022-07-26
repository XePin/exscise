/**  
 * @Title: Test01.java
 * @Description: TODO
 * @author pin
 * @date 2022-02-25 02+12:59:16 
 */  
package com.dcrj.javase.pin_4_50;

/**  
 * @ClassName: Test01
 * @Description: 菲波拉契数列：有一对兔子，从出生后第 3 个月起每个月都生一对兔子
 * 				小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 * 				1 1 2 3 5 8 13 21 34 55 89 144
 * @author pin
 * @date 2022-02-25 02:59:16 
 * 
 */

public class Test01 {

	/**  
	 * @Title: main
	 * @Description: no
	 * @param args
	 * @author pin
	 * @date 2022-02-25 02:59:16 
	 */

	public static void main(String[] args) {
		a(12);
	}
   static void a(int n) {
	   if(n==1) {
		   System.out.println(2);
		   System.exit(1);
	   }
	   int arr[]=new int[n];//里面数字代表数组有多少项
		arr[0] = 1;
		arr[1] = 1;
		for(int i = 2;i<n;i++) {
			arr[i]= arr[i-1]+arr[i-2];
		}
		for(int j:arr) {
			System.out.println(j*2);
		}
		
   }
}
