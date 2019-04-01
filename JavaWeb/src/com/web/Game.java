package com.web;

public class Game {
	private int medal_All = 800; //成员变量
	public void China() {
		int medal_CN = 100; //方法的局部变量
		if (true) {           //代码块
			int gold = 50;    //代码块的局部变量
			medal_CN += gold; //允许访问
			medal_All -= 150; //允许访问
		}
		//gold = 100; //编译出错
		medal_CN += 100;  //允许访问
		medal_All -= 200; //允许访问
	}
	
	public void Other() {
		medal_All = 800; //允许访问
		//medal_CN = 100; //编译出错,不能访问其他方法中的局部变量
		//gold = 10;     //编译出错
	}
}
