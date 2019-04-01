package com.nowcoder;

import java.util.Scanner;

/**
 * 阶乘运算
 * 输入n,求y1=1!+3!+...m!(m是小于等于n的最大奇数)
 * y2 = 2!+4!+...p!(p是小于等于n的最大偶数)
 * @author Administrator
 *
 */
public class Factorial {

	//阶乘方法
	public static int Factorial(int param) {
		int sum = 1;
		int i = 1;
		while (i <= param) {
			sum *= i;
			i++;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int even = 0, odd = 0;
		while (sc.hasNext()) {
			n = sc.nextInt();
			for (int i = 1; i <= n; i++) {
				if (i % 2 == 0) {
					odd += Factorial(i);
				} else {
					even += Factorial(i);
				}
			}
			System.out.println(""+even+" "+odd);
		}
	}
}
