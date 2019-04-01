package com.classic.example;

import java.util.Scanner;

// 不用乘法运算符实现2 x 16
public class ExampleSix {
	
	public static void main(String[] args) {
		// 创建扫描器
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个整数");
		long number = scan.nextLong(); // 获取输入的整数
		System.out.println("您输入的数字是:" + number);
		System.out.println("该数字乘以2的运算结果为:" + (number << 1));
		System.out.println("该数字乘以4的运算结果为:" + (number << 2));
		System.out.println("该数字乘以8的运算结果为:" + (number << 3));
		System.out.println("该数字乘以16的运算结果为:"+ (number << 4));
	}
}
