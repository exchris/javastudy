package com.nowcoder;

import java.util.Scanner;

/**
 * 计算字符个数
 * 输入一个有字母和数字以及空格组成的字符串和一个字符
 * @author Administrator
 * input:ABCEFG A
 * output:1
 */
public class GetCharNumber {
	
	public static int getCharNumber(String str, char ch) {
		//将字符串转换为字符数组
		char[] s = str.toCharArray();
		int count = 0;
		for (int i=0; i<s.length; i++) {
			if (Character.toLowerCase(s[i]) == Character.toLowerCase(ch)) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch = sc.next().charAt(0);
		// TODO Auto-generated method stub
		System.out.println(getCharNumber(str, ch));
	}

}
