<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %> 


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>select_B</title>
</head>
<body>

     <table border = "0" width = "100%">
         <tr>
            <th>Emp ID</th>
            <th>age</th>
            <th>first</th>
            <th>last</th>
         </tr>


<% 
try {
	
	 String connectionURL = "jdbc:mysql://ec2-34-211-112-79.us-west-2.compute.amazonaws.com:3306/mysql";
     Connection connection = null; 
     Class.forName("com.mysql.jdbc.Driver").newInstance(); 
     connection = DriverManager.getConnection(connectionURL, "molotov", "Comrade20");
     if(!connection.isClosed())
          out.println("Successfully connected to " + "MySQL server using TCP/IP...");
     
     
     
     
     Statement st1 = null;
     st1 = connection.createStatement();
     
     ResultSet resultSet = st1.executeQuery("SELECT * FROM Employees");
     
     while (resultSet.next()) {
    	 %>
    	 
    	 
    	
         
    	 <tr>

    	 <td><%=resultSet.getString("id")%></td>
    	 <td><%=resultSet.getString("age")%></td>
    	 <td><%=resultSet.getString("first")%></td>
    	 <td><%=resultSet.getString("last")%></td>
    	


    	 </tr>

    	 <%
    	 }

    	 connection.close();
    	 
} catch (Exception e) {
    	 e.printStackTrace();
    	 }
    	 

 

%>
</table>

</body>
</html>


