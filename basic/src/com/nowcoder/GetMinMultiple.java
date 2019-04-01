package com.nowcoder;

import java.util.Scanner;
//求最大公倍数
public class GetMinMultiple {
	public static int getLargestMultiple(int a, int b) {
		while (a!=b) {
			if (a > b) { 
				a = a-b;
			} else {
				b = b-a;
			}
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("A和B的最大公倍数为:"+a*b/getLargestMultiple(a,b));
		}
	}
}
