package com.dcrj.javase.pin_10_letcote;

import java.util.LinkedHashSet;

public class Test01_String {
    /**
     * 在一个字符串中截取两个相同的字符之间的所有字符并组成字符串
     * @param s
     * @return String 如果没有则返回null
     * */
    public static String longestEqualsCharString(String s) {
        String res = "";
        char key = 0;
        int mark = 0;
        char[] chars = s.toCharArray();
        LinkedHashSet<Character> hs = new LinkedHashSet<>();
        for(var c:chars){
            if(!hs.add(c)){
                key = c;
                break;
            }
        }
        if(s.length()== hs.size()){
            return null;
        }
        for(var c:hs){
            if(c == key){
                mark = 1;
            }
            if(mark == 1){
                res += c;
            }
        }
        return res+key;
    }
    /**
     * 找到最长的回文字符串
     * @param s
     * @return String
     *
     * */
    public static  String longestPalindrome(String s) {
        if(s.length()==1)return s;
        String res = "";
        return res;
    }

    public static void main(String[] args) {
        System.out.println(longestEqualsCharString("abcdefga"));
    }
}
