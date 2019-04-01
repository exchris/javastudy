package com.nowcoder;

import java.util.Scanner;
//字符逆序
public class ReverseString {

	public static String getReverse(String str) {
		StringBuffer sb = null;
		sb = new StringBuffer(str);
		return sb.reverse().toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.nextLine();
			System.out.println(getReverse(str));
		}
	}

}
