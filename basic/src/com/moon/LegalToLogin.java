package com.moon;

import java.util.Scanner;

public class LegalToLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 验证登录信息的合法性
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in); // 创建扫描器
		System.out.println("请输入登录用户名:");
		String username = scan.nextLine(); // 接收用户输入登录名
		System.out.println("请输入登录密码:");
		String password = scan.nextLine(); // 接收用户输入登录密码
		if (!username.equals("mr")) { // 判断用户名合法性
			System.out.println("用户名非法。");
		} else if (!password.equals("mrsoft")) { // 判断密码合法性
			System.out.println("登录密码错误。");
		} else { // 通过以上两个条件判断则默认通过登录验证
			System.out.println("恭喜您，登录信息通过验证。");
		}
		
	}	

}
