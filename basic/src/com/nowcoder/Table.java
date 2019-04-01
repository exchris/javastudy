package com.nowcoder;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			Map<Integer,Integer> map = new TreeMap<Integer, Integer>();
			int number = sc.nextInt();
			for (int i=0; i<number; i++) {
				int index = sc.nextInt();
				int value = sc.nextInt();
				if (map.containsKey(index)) {
					map.put(index, map.get(index)+value);
				} else {
					map.put(index,value);
				}
			}
			for (Integer key :map.keySet()) {
				System.out.println(key+" "+map.get(key));
			}
		}
	}
}
