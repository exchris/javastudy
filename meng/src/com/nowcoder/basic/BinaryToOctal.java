package com.nowcoder.basic;
// 引入java.uti.Scanner;
import java.util.Scanner;
/**
 * 题目描述:输入一个整数,将其转换成八进制数输出 
 */
public class BinaryToOctal {
	
	// 将一个整数转换为八进制数
	public static String getOctal(int result) {
		return Integer.toOctalString(result);
	}
	
	public static void main(String[] args) {
		
		// 创建Scanner对象
		Scanner sc = new Scanner(System.in);
		// 获取用户输入的值
		System.out.println("请输入一个整数:");
		while (sc.hasNext()) {
			int result = sc.nextInt();
			System.out.println(getOctal(result));
		}
	}
}
