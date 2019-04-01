package com.nowcoder;

import java.util.Scanner;

/**
 * 计算字符串最后一个单词的长度,单词以空格隔开
 * @deprecated:一行字符串,非空,长度小于5000
 * @author Administrator
 * input: hello world 
 * output: 5
 */
public class LastWordLength {
	public static int getLength(String str) {
		String[] s = str.split(" ");
		return s[s.length-1].length();
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String str = in.nextLine();
			System.out.println(getLength(str));
		}
		in.close();
	}
}
