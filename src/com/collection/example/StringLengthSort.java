package com.collection.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 按字符串长度排序,倒序
 * @author Administrator
 *
 */
public class StringLengthSort {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayList<String> list = new ArrayList<String>();
		// 插入集合元素
		list.add("zfdsfd");
		list.add("dee");
		list.add("z");
		list.add("fsdfdsfd");
		list.add("abc");
		list.add("z");
		System.out.println("未排序:" + list);
		Collections.sort(list, new MyComparator());
		System.out.println("排序后:" + list);
	}

}

class MyComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// TODO 自动生成的方法存根
		int num = new Integer(s2.length()).compareTo(new Integer(s1.length()));
		if (num == 0) {
			return s1.compareTo(s1);
		}
		return num;
	}

}
