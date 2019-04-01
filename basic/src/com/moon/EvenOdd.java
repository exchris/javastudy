package com.moon;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 用三元运算符判断奇数和偶数
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in); //创建输入流扫描器
		System.out.println("请输入一个整数:");
		long number = scan.nextLong(); // 获取用户输入的整数
		String check = (number % 2 == 0) ? "这个数字是:偶数" : "这个数字是:奇数";
		System.out.println(check);
	}

}
