package com.web;

public class CharAt {
	
	public static void main(String[] args) {
		/**
		 * charAt方法-返回指定索引位置的char值
		 * 该方法返回指定索引位置的char值。
		 * 索引范围为从0到length()-1
		 * 语法:charAt(int index)
		 * index:表示要查询字符的索引值
		 */
		String strCom = "I LIKE JAVA";
		String str = "明日科技";
		int strLower = strCom.charAt(4);
		int s = str.charAt(2);
		System.out.println(strCom+"第4位是:"+strLower+"\n"+str+"第2位是:"+s);
	}
}
