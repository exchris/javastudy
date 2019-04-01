package com.classic.example;

// 自定义图书类的测试类
public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建图书类对象
		Book book = new Book("《Java从入门到精通(第2版)》", "明日科技", 59.8);
		// 输出书名
		System.out.println("书名:" + book.getTitle());
		// 输出作者
		System.out.println("作者:" + book.getAuthor());
		// 输出价格
		System.out.println("价格:" + book.getPrice());
	}

}
