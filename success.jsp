<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="amazon.dto.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SUCCESS</title>
</head>
<body>
<h3>login successful</h3>
<h1>

<!-- %
//User user = (User) session.getAttribute("user");    if browser make second request
User user = (User) request.getAttribute("user");
%>

  another way is use bean. it make read page easy
  
   -->
<jsp:useBean id="user" class="amazon.dto.User" scope="request">
<jsp:setProperty property="userName" name="user" value="creatednewuserifnot found" />

</jsp:useBean>




<!-- 
hello %=user.getUserName() %> !
 -->
 
 Hello <jsp:getProperty property="userName" name="user"/>
 
</h1>
</body>
</html>