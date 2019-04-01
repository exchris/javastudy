package com.nowcoder.interviews;

public class Solution {
	
	/**
	 * 斐波那契数列
	 */
	public static int Fibonacci(int n) {
		if (n > 39) {
            return 0;
        }
		if (n < 2) {
			return n;
		} else {
			return Fibonacci(n-1) + Fibonacci(n-2);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Fibonacci(39));
	}
}
