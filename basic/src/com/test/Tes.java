package com.test;

public class Tes {
	public static void main(String[] args) {
//		int a = 10;
//		int b = 10;
//		method(a, b);
//		System.out.println("a="+a);
//		System.out.println("b="+b);
//		System.out.println(getServen(9999));
		System.out.println(getResult("OkhaoPingCeilXu"));
	}

//	private static void method(int a, int b) {
//		System.out.println("a=100,b=200");
//		System.exit(0);
//	}
	
	//计算0-n中7的个数
	private static int getServen(int n){
		int sum = 0;
		for(int i=0; i<=n; i++) {
			//将整数转换为字符串
			String str = ""+i;
			char[] stringArr = str.toCharArray();
			for(int j=0; j<stringArr.length; j++) {
				if(stringArr[j] == '7') {
					sum++;
				}
			}
		}
		return sum;
	}
	
	public static String getResult(String str){ 
		return str.replaceAll("[A-Z]","")+str.replaceAll("[a-z]",""); 
	}
}
