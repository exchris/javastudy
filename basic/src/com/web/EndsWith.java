package com.web;

public class EndsWith {
	
	public static void main(String[] args) {
		
		/**
		 * 判断字符串是否以指定的后缀结束
		 * endsWith(String suffix)
		 * suffix:指定的字符串后缀
		 * 区分字母大小写
		 */
		String strCom = "string.java"; //定义一个文件名字符串
		boolean str = strCom.endsWith(".java"); //判断字符串是否以.java为后缀
		System.out.println(str);
		
		String str1 = "abcdefg"; //定义字符串
		String str2 = "ABCDEFG"; //定义字符串
		//判断字符串str1是否以efg为结尾
		boolean end = str1.endsWith("efg");
		//判断字符串str2是否以efg为结尾
		boolean end2 = str2.endsWith("efg");
		System.out.println("str1是否以efg结尾:"+end); //输出比较结果
		System.out.println("str2是否以efg结尾:"+end2);
	}
}
