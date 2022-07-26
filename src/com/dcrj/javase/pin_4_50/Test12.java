package com.dcrj.javase.pin_4_50;

/**  
 * @ClassName: Test12
 * @Description: 
 * 你在玩儿游戏打怪兽，现在有两个怪兽，
 * 生命值分别是a和b，你有两个技能
 * 一个是单体攻击技能，伤害是x。
 * 一个是群体攻击技能，伤害是y，
 * 给定a,b,x,y求使用最少几个技能可以杀死两个怪兽.
 * @author pin
 * @date 2022-03-28 07:19:39 
 */

public class Test12 {

	public static void main(String[] args) {
		System.out.println(count(16,21,5,1));
		
	}  
	public static int count(int a,int b,int x,int y) {
		int count = 0;
		int max = a>b?a:b;
		int min = a>b?b:a;
			if(x<=y) {
				while(max>0) {
					max-=y;
					count++;
				}
			}
			if(x>y*2) {
				
			}
		return count;
	}

}
