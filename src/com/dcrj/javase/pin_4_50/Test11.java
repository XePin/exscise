package com.dcrj.javase.pin_4_50;

import java.util.Scanner;
import java.util.TreeSet;

/**  
 * @ClassName: Test11
 * @Description: 把500个1-500的数放入数组，排序并删除相同值的数。
 * @author pin
 * @date 2022-03-25 05:30:40 
 */

public class Test11 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var list = new TreeSet<Integer>();
		for(int i = 0;i<1000;i++) {
			int num = sc.nextInt();
			list.add(num);
		}		
		list.forEach(System.out::println);
	}

}
