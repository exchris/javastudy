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
 int sum = 0;
 for (int i=1; i<=100; i++) {
	 sum += i;
 }
 out.println("1到100的所有整数的和是:"+sum);
 out.println("<br>");
 
 int i = 1;
 int sum2 = 0;
 while (i <= 100) {
	 sum2 += i;
	 i++;
 }
 out.println("从1到100的所有整数的和是:"+sum2);
 out.println("<br>");
 
 int sum3 = 0;
 int i2 = 1;
 do {
	 sum3 += i2;
	 i2++;
 } while (i2 <= 100);
 out.println("从1到100的所有整数的和是:"+sum3);
 
%>
</body>
</html>