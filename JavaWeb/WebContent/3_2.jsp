<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
  int num = 0; //声明一个计数变量
  //该方法实现访问次数的累加操作
  synchronized void add() {
	  num++;
  }
%>
<% add(); //该脚本程序调用实现访问次数累加的方法%>
<center>
	您是第<%=num %>位访问该页的游客!
</center>
</body>
</html>