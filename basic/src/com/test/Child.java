package com.test;

public class Child extends Father {
	public static void talk() {
		System.out.println("我是子类,我会说话");
	}
	public static void main(String[] args) {
		talk();
	}
}
