package com.nowcoder;

import java.util.Scanner;

//输入整型数组和排序标识,对其元素按照升序或降序进行排序
public class StringFenge {
	public static String reverse(String sentence) {
		StringBuffer sb = null;
		sb = new StringBuffer(sentence);
		return sb.reverse().toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.nextLine();
			System.out.println(reverse(str));
		}
	}
}
