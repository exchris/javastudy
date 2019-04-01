package com.nowcoder;


public class Main {
	public static String reverseString(String iniString) {
		StringBuffer sb = null;
		sb = new StringBuffer(iniString);
		sb = sb.reverse();
		return sb.toString();
	}
	
	public static int reverse(int x) {
		if (x > 2147483647 || x < -2147483648) {
			return 0;
		}
		// 首先把x转换成字符串
		String str = Integer.toString(Math.abs(x));
		StringBuffer sb = null;
		sb = new StringBuffer(str);
		sb = sb.reverse();
		String result = null;
		if (x < 0) {
			result = "-" + sb.toString();
		} else {
			result = sb.toString();
		}
		return Integer.parseInt(result);	
	}
	
	public static void main(String[] args) {
		System.out.println(reverseString("This is nowcoder"));
		System.out.println(reverse(-123));
	}
}
