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
	int store = 10;
	out.print(store <= 2 ? "库存不足!" : "库存量:"+store);
	store = 1;
	out.print(store <= 2 ? "<br/>库存不足!" : "库存量:"+store);
%>
</body>
</html>