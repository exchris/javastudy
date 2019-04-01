<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% int able = 1; %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<% if(able == 1) { %>
	<tr><td>欢迎登录!您的身份为"普通管理员"。</td></tr>
<% } else if (able == 2) { %>
	<tr><td>欢迎登录!您的身份为"系统管理员"</td></tr>
<% } %>
</table>
</body>
</html>