package com.web;

/**
 * 基本数据类型
 * 整数类型:
 * 	字节型   byte  8
 *  短整型   short 16
 *  整型       int   32
 *  长整型    long  64
 * 浮点类型
 *   单精度型  float 32
 *   双精度型  double 64
 * 字符型
 * 	  字符型   char 16
 * 布尔型
 * 	 布尔型   boolean 8
 * 
 * 基本数据类型间的转换
 *   (1) 自动类型转换
 *   	byte,short,char->int->long->float->double(低->高)
 *   (2) 强制类型转换
 *   byte  b = 3; 		//定义字节型b
 *   int  i1 = 261, i2;	//定义整型i1,i2
 *   long L1 = 102, L2;  //定义长整型L1,L2
 *   float f1 = 1.234f;   //定义浮点型f1
 *   double d1 = 5.678;   //定义双精度d1
 *   short s1 = 65, s2;   //定义短整型s1,s2
 *   char c1='a',c2 ;   //定义字符型c1,c2
 *
 *	s2 = (short)c1; //将char型强制转换为short型,s2值为:97
 */
public class DataType {
	byte  b = 3; 		//定义字节型b
	int  i1 = 261, i2;	//定义整型i1,i2
	long L1 = 102, L2;  //定义长整型L1,L2
	float f1 = 1.234f;   //定义浮点型f1
	double d1 = 5.678;   //定义双精度d1
	short s1 = 65, s2;   //定义短整型s1,s2
	char c1='a' ;   //定义字符型c1,c2
	
}
