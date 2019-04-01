package com.nowcoder.basic;
import java.util.Scanner;
/**
 * 输入n,
 * 求
 * y1=1!+3!+...+m!(m是小于等于n的最大奇数)
 * y2=2!+4!+...+p!(p是小于等于n的最大偶数) 
 * 输出y1,y2
 */
public class FactorialOperation {
	
	public static int factorial(int n) {
		int result = 1;
		for (int i=1; i<=n; i++) {
			result *= i;
		}
		return result;
	}
	
	public static int getEvenFactorial(int n) {
		int even = 0; // 偶数
		for (int i=1; i<=n; i++) {
			if (i % 2 == 0) {
				even += factorial(i);
			}
		}
		return even;
	}
	
    public static int getOddFactorial(int n) {
		int odd = 0; // 奇数
		for (int i=1; i<=n; i++) {
			if (i % 2 != 0) {
				odd += factorial(i);
			}
		}
		return odd;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
            int m = sc.nextInt();
            System.out.print(getOddFactorial(m)+" "+getEvenFactorial(m));
        }
		sc.close();
	}
}
