package com.nowcoder;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {

			String str = sc.next().substring(2);
			System.out.println(Integer.parseInt(str, 16));
		}
	}

}
