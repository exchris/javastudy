package com.moon;

import java.util.Scanner;

public class NotUseMultiToCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 不用乘法运算符实现2x16
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in); //创建扫描器
		System.out.print("请输入一个整数");
		long number = scanner.nextLong(); //获取输入的整数
		System.out.println("你输入的数字是:"+number);
		System.out.println("该数字乘以2的运算结果为:"+(number<<1));
		System.out.println("该数字乘以4的运算结果为:"+(number<<2));
		System.out.println("该数字乘以8的运算结果为:"+(number<<3));
		System.out.println("该数字乘以16的运算结果为:"+(number<<4));
	}

}
