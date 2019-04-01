package com.nowcoder;

import java.util.*;
/**
 * 输入一个整数,将其转换成八进制数输出
 */
public class IntToEight {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请你输入一个整数\n");
		int n;
		while (sc.hasNext()) {
			n = sc.nextInt();
			System.out.printf("%o\n", n);
		}
	}
}
