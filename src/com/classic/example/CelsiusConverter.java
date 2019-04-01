package com.classic.example;
import java.util.Scanner;
// 温度单位转换工具
public class CelsiusConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入要转换的温度(单位:摄氏度)");
		Scanner input = new Scanner(System.in); // 获得控制台输入
		double celsius = input.nextDouble(); // 获取用户输入的摄氏温度
		
		CelsiusConverter converter = new CelsiusConverter(); // 创建类的对象
		double fahrenheit = converter.getFahrenheit(celsius); // 转换温度为华氏度
		System.out.println("转换完成的温度(单位:华氏度):" + fahrenheit); // 输出转换结果
		// 关闭扫描器
		input.close();
	}

	private double getFahrenheit(double celsius) {
		// TODO Auto-generated method stub
		double fahrenheit = 1.8 * celsius + 32; // 计算华氏温度 
		return fahrenheit;
	}

}
