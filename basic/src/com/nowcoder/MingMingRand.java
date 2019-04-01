package com.nowcoder;

import java.util.Scanner;
import java.util.TreeSet;

public class MingMingRand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			TreeSet<Integer> set = new TreeSet<Integer>();
			int n = sc.nextInt();
			if (n > 0) {
				for (int i=0; i<n; i++) {
					set.add(sc.nextInt());
				}
			}
			for (Integer i:set) {
				System.out.println(i);
			}
		}
	}

}
