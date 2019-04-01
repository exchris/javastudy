package com.suggest;

public class SuggestThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 三元操作符的类型务必一致
		int i = 80;
		String s = String.valueOf(i < 100 ? 90 : 100);
		String s1 = String.valueOf(i < 100 ? 90 : 100.0);
		System.out.println("两者是否相等:" + s.equals(s1));
	}
}
