/**
 *@Copyright:Copyright (c) 2014 - 2100
1
 *@Company:优问
 */
package com.test;

import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {
		/**
		 * 一个数组：122345这6个数，打印出它所有可能的组合；要求4不能在第3位，3和5不能相连。
		 */
		int[] initTmpArr = new int[] { 1, 2, 2, 3, 4, 5 };
		int tmp;

		for (int i = 0; i < initTmpArr.length - 1; i++) {
			for (int j = i + 1; j < initTmpArr.length; j++) {
				tmp = initTmpArr[i];
				// 4不能在第3位
				if (i == 2) {
					if (initTmpArr[j] == 4) {
						continue;
					}
				}

				if (!isCanChange(initTmpArr, j, tmp, 3, 5)) {
					continue;
				}

				if (!isCanChange(initTmpArr, j, tmp, 5, 3)) {
					continue;
				}

				if (!isCanChange(initTmpArr, i, initTmpArr[j], 3, 5)) {
					continue;
				}

				if (!isCanChange(initTmpArr, i, initTmpArr[j], 5, 3)) {
					continue;
				}

				if (tmp != initTmpArr[j]) {
					// 交换位置
					initTmpArr[i] = initTmpArr[j];
					initTmpArr[j] = tmp;
					// 打印
					System.out.println("可能的排列：" + Arrays.toString(initTmpArr));
					// 打印完又将位置换回来
					initTmpArr[j] = initTmpArr[i];
					initTmpArr[i] = tmp;
				}
			}
		}
	}

	public static boolean isCanChange(int[] arr, int j, int tmp, int a1, int a2) {
		// 3和5不能相连
		if (tmp == a1) {
			if (j != 0) {
				if (arr[j - 1] == a2) {
					return false;
				}
			}
			if (j != arr.length - 1) {
				if (arr[j + 1] == a2) {
					return false;
				}
			}
		}
		return true;
	}

}