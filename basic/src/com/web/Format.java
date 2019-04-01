package com.web;

import java.util.Date;
import java.util.Locale;

public class Format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * format方法:格式化字符串
		 * format(String format,Object...args)
		 * format:格式字符串
		 * args:格式字符串中由格式说明符引用的参数。参数数目是可变的,可以为0
		 * %b,%B:格式化为布尔类型
		 * %h,%H:格式化为散列码
		 * %s,%S:格式化为字符串类型
		 * %c,%C:格式化为字符类型
		 * %d:格式化为十进制数
		 * %o:格式化为八进制数
		 * %x,%X:格式化为十六进制数
		 * %e:格式化为用计算机科学计数法表示的十进制数
		 * %a:格式化为带有效位数和指定的十六进制浮点值
		 * %n:结果为特定平台的行分隔符
		 * %%:结果为字面值'%'
		 */
		String str = String.format("%d", 400/2);
		String str2 = String.format("%b", 3 > 5);
		System.out.println("格式化后值为:"+str+","+str2);
		
		/**
		 * format(Locale l, String format, Object...args)
		 * format:格式字符串
		 * args:
		 * %te:一个月中的某一天(1~31)
		 * %tb:指定语言环境的月份简称
		 * %tB:指定语言环境的月份全称
		 * %tA:指定语言环境的星期几全称
		 * %ta:指定语言环境的星期几简称
		 * %tc:包括全部日期和时间信息
		 * %tY:4位年份
		 * %tj:一年中的第几天(001~366)
		 * %tm:月份
		 * %td:一个月中的第几天(01~31)
		 * %ty:两位年份
		 */
		Date date = new Date(); //定义Date类对象
		Locale form = Locale.US;
		String year = String.format(form, "%tY", date); //将当前年份进行格式化
		String month = String.format(form, "%tB", date); //将当前月份进行格式化
		String day = String.format(form, "%td", date);  //将当前日期进行格式化
		System.out.println("今年是:"+year+"年");
		System.out.println("现在是:"+month+"月");
		System.out.println("今天是:"+day+"号");
		
	}

}
