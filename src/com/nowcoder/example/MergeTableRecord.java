package com.nowcoder.example;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

// 合并表记录

public class MergeTableRecord {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				int s = sc.nextInt();
				int value = sc.nextInt();
				if (map.containsKey(s)) {
					map.put(s, map.get(s) + value);
				} else {
					map.put(s, value);
				}
				for (Integer key : map.keySet()) {
					System.out.println(key + " " + map.get(key));
				}
			}
		}
	}

}
