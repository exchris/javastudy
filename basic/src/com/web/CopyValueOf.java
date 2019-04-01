package com.web;

public class CopyValueOf {

	public static void main(String[] args) {
		char[] array = {'明', '日', '科', '技'};
		/**
		 * copyValueOf方法:字符数组生成字符串
		 * copyValueOf(char[] data)
		 * data:字符数组
		 */
		String str = String.copyValueOf(array);
		System.out.println(str);
		
		/**
		 * 返回一个字符串,其中包含字符数组的指定子数组字符
		 * copyValueOf(char[] data, int offset, int count)
		 * data:字符数组
		 * offset:子数组的初始偏移量
		 * count:子数组的长度
		 */
		String str1 = String.copyValueOf(array, 0, 2);
		System.out.println(str1);
	}
}
