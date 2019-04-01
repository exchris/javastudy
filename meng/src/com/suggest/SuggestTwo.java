package com.suggest;

import java.util.Random;

public class SuggestTwo {
	public static void main(String[] args) {
		
		// 建议: 莫让常量蜕变成变量
		// 务必让常量的值在运行期保持不变。
		System.out.println("常量会变哦: " + Const.RAND_CONST);
	}
}

/**接口常量**/
interface Const {
	// 这还是常量吗?
	public static final int RAND_CONST = new Random().nextInt();
}