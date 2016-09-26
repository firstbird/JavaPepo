<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix = "s" uri="/struts-tags" %>
<%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<hr/>
<h1>
	Name: <s:property value="#request.name" default="not set" /><br>
	Message: <s:property value="message" default="not set" /><br>
	Address: <s:property value="#request.address" default="not set" /><br>
	
	countrys: <s:property value="#request.Country" default="not set" /><br>
	<c:forEach var="bean" items="${List}">
	${bean.name} | ${bean.id} | ${bean.country.name}<br>
	</c:forEach>   
</h1>
</body>
</html>