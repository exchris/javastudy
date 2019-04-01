package com.nowcoder;

import java.util.Scanner;

//求立方根
public class Cubic {
	
	public static double getCubeRoot(double input) {
		return Math.cbrt(input);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextDouble()) {
			double param = sc.nextDouble();
			System.out.println(getCubeRoot(param));
		}
	}
}
