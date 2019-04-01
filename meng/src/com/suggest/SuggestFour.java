package com.suggest;

import java.text.NumberFormat;

public class SuggestFour {
	// 避免带有变长参数的方法重载
	
	// 简单折扣计算
	public void calPrice(int price, int discount) {
		float knockdownPrice = price * discount / 100.0F;
		System.out.println("简单折扣后的价格是:"
			+ formateCurrency(knockdownPrice));
	}
	
	// 复杂多折扣计算
	public void calPrice(int price, int ...discounts) {
		float knockdownPrice = price;
		for (int discount : discounts) {
			knockdownPrice = knockdownPrice * discount / 100;
		}
		System.out.println("复杂折扣后的价格是:"
		   + formateCurrency(knockdownPrice));
	}
	
	// 格式化成本的货币形式
	private String formateCurrency(float price) {
		return NumberFormat.getCurrencyInstance()
			.format(price / 100);
	}
	
	public static void main(String[] args) {
		SuggestFour sf = new SuggestFour();
		// 499元的货物,打75折
		sf.calPrice(49900, 75);
	}
}
