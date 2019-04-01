package com.nowcoder;

import java.util.Scanner;

/**
 * 输出该数值的近似整数值
 * 如果小数点数值大于等于5 向上取整
 * 如果小数点小于5,则向下取整
 * @author Administrator
 */

public class Approximation {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			double d = sc.nextDouble();
			int dint = (int)d;
			if ((d-dint)>=0.5 && (d-dint)<1) 
				dint++;
			System.out.println(dint);
		}
		
	}
}
