package com.moon;

import java.util.Scanner;
public class InputCode {
	public static void main(String[] args) {
		// 创建输入流扫描器
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		// 提示用户输入
		System.out.println("请输入你的身份证号:");
		// 获取用户输入的一行文本
		String line = scanner.nextLine(); 
		// 打印对输入文本的描述
		System.out.println("原来你身份证号是"+line.length()+"位数字的啊!");
	}
}
