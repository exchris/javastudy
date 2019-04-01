package com.nowcoder;

import java.util.Scanner;

/**
 * 质数因子
 * @author Administrator
 * 180
 * 2 2 3 3 5
 */
public class Proton {
	private static void isPrimerFactors(long num) {
		long number = num;
		while (number != 1) {
			for (int i = 2; i<=number; i++) {
				if (number % i == 0) {
					number /= i;
					System.out.print(i+" ");
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long number = 0;
		
		while (sc.hasNextLong()) {
			number = sc.nextLong();
			isPrimerFactors(number);
		}
	}
}
