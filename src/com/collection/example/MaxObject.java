package com.collection.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 求对象的最大值
 * @author Administrator
 * 1.类本身实现比较功能或者使用比较器
 * 2.按对象的age求最大值
 */
class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class MaxObject {
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("list001", 34));
		list.add(new Person("list002", 16));
		list.add(new Person("list003", 16));
		list.add(new Person("list004", 23));
		System.out.println("未排序::");
		sop(list);
		// 排序
		Collections.sort(list, new PersonCom());
		System.out.println("排序后:");
		sop(list);
		Person maxPerson = Collections.max(list, new PersonCom());
		System.out.println("年龄最大的人:" + maxPerson.getName() + 
		    "...." + maxPerson.getAge());
	}
	
	private static void sop(ArrayList<Person> list) {
		// TODO 自动生成的方法存根
		for (Person p : list) {
			System.out.println(p.getName() + "..." + p.getAge());
		}
	}
}

class PersonCom implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO 自动生成的方法存根
		int num = new Integer(o1.getAge()).compareTo(new Integer(o2.getAge()));
		if (num == 0) {
			return o1.getName().compareTo(o2.getName());
		}
		return num;
	}
	
}
