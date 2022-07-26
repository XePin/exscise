/**  
 * @Title: Test10.java
 * @Description: TODO
 * @author pin
 * @date 2022-03-02 05+12:31:40 
 */  
package com.dcrj.javase.pin_4_50;

/**  
 * @ClassName: Test10
 * @Description: 实现一个按字节来截取字符串的子串的方法，功能类似于
 *	String类的substring()方法，String类是按字符截取的，例如"中国
 *	abc".substring(1,3)，将返回"国a"。这里要求按字节截取，一个英
 *	文字符当一个字节，一个中文字符当两个字节。
 * @author pin
 * @date 2022-03-02 05:31:40 
 */

public class Test10 {
	private String s;
	public Test10(){}
	public Test10(String s){}
	public StringBuilder substring(int i , int n) {
		char[] chars = this.toString().toCharArray();
		char[] res = new char[n-i];
		StringBuilder ss = new StringBuilder();
		for(var e = 0 ;e< res.length;e++){
			res[e] = chars[i];
			i++;
		}
		for(var e :res){
			ss.append(e);
		}

		return ss;
	}


	public static void main(String[] args) {
		System.out.println(new Test10("122366").substring(0, 40));
	}
}
