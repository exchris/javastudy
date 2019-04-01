<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<script>
  var str = "7";
  for (i=0; i<4; i++) {
	  str = "0"+str;
  }
  document.write(str+"\n\r");
  
  var i1 = 0;
  var str1 = "7";
  while (i1<4) {
	  str1 = "0"+str1;
	  i1++;
  }
  document.write(str1+"\n\r");
  
  var i2 = 0;
  var str2 = "7";
  do {
	  str2 = "0"+str2;
	  i2++;
  } while(i2<4);
  document.write(str2);
</script>
</body>
</html>