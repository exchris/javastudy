package com.nowcoder;
//记负均正

import java.util.Scanner;

//-13 -4 -7 
// 3 0.0
public class JiFuJunZheng {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int positive = 0; //负数个数
		int negative = 0; //整数个数
		float sum = 0; //整数和
		while (in.hasNext()) {
			int num = in.nextInt();
			if (num < 0) {
				negative++;
			} else {
				sum += num;
				positive++;
			}
		}
		System.out.println(negative);
		if (positive == 0) {
			System.out.println(0.0);
		} else {
			System.out.printf("%.1f\n",sum/positive);	
		}
	}

}
