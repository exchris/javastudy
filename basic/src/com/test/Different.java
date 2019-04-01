package com.test;

import java.util.*;

public class Different {
	public static void main(String[] args) {
		String str = "This is nowcoder";
		String s = reverseString(str);
		System.out.println(s);
	}
	
	/**
	 * 确定字符串互异 如果字符串存在相同返回false,反之为true
	 * @param iniString
	 * @return boolean
	 */
	public static boolean checkDifferent(String iniString) {
		// write code here
		if (iniString.length() >= 3000) {
			return false;
		} else {
			char[] chars = iniString.toString().toCharArray();
			for (int i = 0, len = iniString.length(); 
					i < len; i++) {
				for (int j = i + 1; j < iniString.length(); j++) {
					if (chars[i] == chars[j]) {
						return false;
					}
				}
			}
		}
		return true;
	}

	public static String reverseString(String iniString) {
		char[] chars = iniString.toString().toCharArray();
		String reverse = "";
		for (int i = chars.length - 1; i >= 0; i--) {
			reverse += chars[i];
		}
		return reverse;
	}
}
