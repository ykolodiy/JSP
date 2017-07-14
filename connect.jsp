<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %> 


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>mysql</title>
</head>
<body>

<% 
try {
	
	 String connectionURL = "jdbc:mysql://ec2-34-211-112-79.us-west-2.compute.amazonaws.com:3306/mysql";
     Connection connection = null; 
     Class.forName("com.mysql.jdbc.Driver").newInstance(); 
     connection = DriverManager.getConnection(connectionURL, "", "");
     if(!connection.isClosed())
          out.println("Successfully connected to " + "MySQL server using TCP/IP...");
     connection.close();
 }catch(Exception ex){
     out.println("Unable to connect to database"+ex);
}







%>


</body>
</html>


