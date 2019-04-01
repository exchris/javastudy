package com.classic.example;

import java.util.Scanner;

// 从控制台接收输入字符
public class InputCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 创建输入流扫描器
		Scanner scanner = new Scanner(System.in);
		// 提示用户输入
		System.out.println("请输入您的身份证号:");
		// 获取用户输入的一行文本
		String line = scanner.nextLine();
		// 打印对输入文本的描述
		System.out.println("原来你身份证号是" + 
		    line.length() + "位数字");
		
		// 关闭扫描器
		scanner.close();
	}

}
