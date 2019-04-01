package com.moon;

import java.util.Scanner;

public class JudgeMonthInSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 判断用户输入月份的季节
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in); // 创建扫描器
		// 提示用户输入的月份
		System.out.println("请输入一个月份,我能告诉你它属于那个季节");
		int month = scan.nextInt(); // 接收用户输入
		try {
			if (month < 1 || month > 12) {
				System.out.println("月份值为1-12");
			} else {
				switch (month) {
					case 12:
					case 1:
					case 2:
						System.out.println("您输入的月份属于冬季。");
						break;
					case 3:
					case 4:
					case 5:
						System.out.println("您输入的月份属于春季。");
						break;
					case 6:
					case 7:
					case 8:
						System.out.println("您输入的月份属于夏季。");
						break;
					case 9:
					case 10:
					case 11:
						System.out.println("您输入的月份属于秋季。");
						break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
