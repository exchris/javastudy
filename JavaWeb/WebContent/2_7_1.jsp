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
String str;
str = new String("平平淡淡才是真!<br>");
String str1 = new String("快快乐乐才是福!<br>");
out.println(str);
out.println(str1);

char[] myL = {'简','单','快','乐'};
String str3 = new String(myL,1,2);
out.println("Str3="+str3);
%>
</body>
</html>