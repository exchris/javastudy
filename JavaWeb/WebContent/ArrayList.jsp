<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%
	List<String> list = new ArrayList<String>();
	for (int i=0; i<3; i++) {
		list.add(new String("福娃"+i));
	}
	list.add(1,"后添加的福娃");
	//输出全部元素
	Iterator<String> it = list.iterator();
	while (it.hasNext()) {
		out.println(it.next()+",");
	}
%>