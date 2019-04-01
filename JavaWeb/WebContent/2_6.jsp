<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
  int inWeek = 1;
  switch (inWeek) {
    case 1: 
	  	out.println("新的一周开始了,努力学习吧!");
	  	break;
    case 2:
    	out.println("继续努力学习吧,周二!");
    	break;
    case 3:
    	out.println("继续努力学习吧,周三!");
    	break;
    case 4:
    	out.println("继续努力学习吧,周四!");
    	break;
    case 5:
    	out.println("继续努力学习吧,周五!");
    	break;
    default:
    	out.println("休息了");
    	break;
  
  }
%>
</body>
</html>