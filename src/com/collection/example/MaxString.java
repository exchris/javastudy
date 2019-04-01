package com.collection.example;

import java.util.ArrayList;
import java.util.Collections;

// 求集合字符串的最大值
public class MaxString {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayList<String> list = new ArrayList<String>();
		list.add("zfdsfd");
		list.add("dee");
		list.add("z");
		list.add("fsdfdsfd");
		list.add("abc");
		list.add("z");
		Collections.sort(list);
		System.out.println("排序后:" + list);
		String max = Collections.max(list);
		System.out.println("max=" + max);
		
	}

}
