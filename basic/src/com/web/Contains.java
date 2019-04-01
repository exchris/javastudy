package com.web;

public class Contains {
	
	/**
	 * contains方法----判断是否包含指定字符
	 * contains(CharSequence s)
	 * 判断结果以boolean类型返回
	 */
	public static void main(String[] args) {
		String strCom = "I LIKE JAVA!";
		boolean str = strCom.contains("JAVA");
		System.out.println(str);
	}
}
