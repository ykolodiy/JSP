<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>kyivstar</title>
</head>
<body>
<%!
public int add (int a, int b) {return a+b;}
%>

<%
int n = 1;
int h = 2;
int l = n+h;

%>
 
<h1>nahuj suka <% out.println(l);
%></h1>



the value is: <%=l %>

<%
l=add(43545, 4356);


%>

the value is: <%=l %>



</body>
</html>
