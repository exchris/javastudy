package com.test;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Age {

	public static void main(String[] args) {
		System.out.println(getSystemTime());
	}

	public static String getSystemTime() {
		Date date = new Date(0);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return df.format(date);
	}
}
