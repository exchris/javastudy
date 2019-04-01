package com.classic.example;

import java.util.Scanner;

// 加密可以这样简单(位运算)
public class BitOperation {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个英文字符串或解密字符串");
		String passwd = scan.nextLine(); // 获取用户输入
		char[] array = passwd.toCharArray(); // 获取字符数组
		for (int i = 0; i < array.length; i++) { // 遍历字符数组
			array[i] = (char)(array[i] ^ 20000);  // 对每个数组运算进行异或运算
		}
		System.out.println("加密或解密结果如下:");
		System.out.println(new String(array)); // 输出密钥
	}

}
