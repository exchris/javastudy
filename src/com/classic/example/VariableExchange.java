package com.classic.example;

// 实现两个变量的互换（不借助第3个变量）
import java.util.Scanner;
public class VariableExchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); // 创建输入流扫描器
		System.out.println("请输入变量A的值");
		long A = scan.nextLong(); // 接收第一个变量值
		System.out.println("请输入变量B的值");
		long B = scan.nextLong(); // 接收第二个变量值
		System.out.println("A=" + A + "\tB=" + B);
		System.out.println("执行变量互换...");
		A = A ^ B ; // 执行变量互换
		B = B ^ A ;
		A = A ^ B ;
		System.out.println("A=" + A + "\tB=" + B);
			
	}

}
