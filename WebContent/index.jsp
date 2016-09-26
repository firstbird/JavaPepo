<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Head line</h1>
   <h1>Hello World From Struts2</h1>
   <form action="hello">
      <label for="message">Please enter your name</label><br/>
      <input type="text" name="message"/>
      <input type="submit" value="Say Hello"/>
   </form>
<s:form action="User" >
    <s:submit />
</s:form>
<s:form action="addUser" >
    <s:submit action="addUser" value="Add" />
</s:form>
<s:form action="updateUser" >
    <s:submit action="updateUser" value="Update" />
</s:form>
<s:form action="deleteUser" >
    <s:submit action="deleteUser" value="Delete" />
</s:form>

<a href="redirect1" >redirect1</a>
<a href="regUser" >regUser</a>  
</body>
</html>