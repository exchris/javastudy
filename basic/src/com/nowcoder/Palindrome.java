package com.nowcoder;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		String a = null;
		StringBuffer sb = null;
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			a = in.nextLine();
			sb = new StringBuffer(a);
			sb = sb.reverse();
			if (a.compareTo(sb.toString()) == 0) {
				System.out.println("Yes!");
			} else {
				System.out.println("No!");
			}
		}
		in.close();
	}
}
