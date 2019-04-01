package com.web;

public class CompareTo {
	
	public static void main(String[] args) {
		String strCom  = "I LIKE JAVA";
		String strCom1 = "i like php";
		/**
		 * compareTo():比较两个字符串
		 * 相等	返回0
		 * compareTo只在方法equals(Object)返回true时才返回0
		 */
		int strLower = strCom.compareTo(strCom1);
		System.out.println(strLower+"\n");
		
		String word = "I LIKE JAVA"; //定义字符串
		int com = word.compareTo("i like java"); //调用compareTo方法
		int another = word.compareToIgnoreCase("i like java"); //调用compareToIgnoreCase方法
		
		System.out.println("使用compareTo方法比较结果:"+com);
		System.out.println("使用compareToIgnoreCae方法比较结果:"+another);
		
		
	}
}
