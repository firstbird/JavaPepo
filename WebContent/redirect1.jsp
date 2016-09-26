<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
redirect1 demo
result is
${message}

<form action="regUser" method="post">
 name:<input type="text" name="name"><br>
 passwd:<input type="password" name="pwd"><br>
 email:<input type="text" name="email"><br>
 <input type="submit" value="submit"><br>
</form>
</body>
</html>