package com.web;

public class Equals {
	
	public static void main(String[] args) {
		/**
		 * equals方法:字符串比较
		 * equals(object obj)
		 * 相等:true
		 * 不等:false
		 * 区分大小写
		 */
		String strCom1 = "MN";
		String strCom2 = "mn";
		boolean strB = strCom1.equals(strCom2);
		System.out.println(strB);
		
		/**
		 * equalsIgnoreCase方法:忽略大小写判断字符串相等
		 * equalsIgnoreCae(String anotherString)
		 */
		boolean strA = strCom1.equalsIgnoreCase(strCom2);
		System.out.println(strA);
	}
}
