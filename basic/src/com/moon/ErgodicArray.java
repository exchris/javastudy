package com.moon;

public class ErgodicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 使用while循环语句与自增
		// 创建鸟类数组
		String[] aves = new String[] {"白鹭", "黄鹂", "鹦鹉", "乌鸦",
				"喜鹊", "布谷鸟", "斑鸠", "百灵鸟"};
		int index = 0; // 创建索引变量
		String result = "";
		System.out.println("我的花园里有很多鸟，大约包括:");
		while (index < aves.length) { // 变量数组
			result += aves[index++] + ","; // 自增索引值
		}
		System.out.println(result.substring(0, result.length()-1));
	}

}
