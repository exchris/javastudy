<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%
	Vector v = new Vector(); //创建空的Vector对象
	for (int i=0; i<3; i++) {
		v.add(new String("福娃"+i));
	}
	v.remove(1); //移除索引位置为1的元素
	//显示全部元素
	for (int i=0; i<v.size(); i++) {
		out.println("元素"+v.indexOf(v.elementAt(i))+":"+v.elementAt(i)+" |");
	}
%>