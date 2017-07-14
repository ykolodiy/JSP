<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
 
<html>
   <head>
      <title>SELECT Operation</title>
   </head>

   <body>
   
   
 insert<form name="formjsp" method="post" action="insert.jsp">
<table width="100%" border="0" cellspacing="0" cellpadding="0">

  <tr>
    <td>Emp ID </td>
    <td><input type="text" name="id"></td>
    </tr>
  
  
    <tr>
    <td>age</td>
    <td><input type="text" name="age"></td>
    </tr>
  
  
  
    <tr>
    <td>first Name</td>
    <td><input type="text" name="first"></td>
    </tr>
  
  
     <tr>
    <td>last</td>
    <td><input type="text" name="last"></td>
    </tr>
  
  
  <tr>
       <td><input type="submit" name="submit" value="Submit"></td>
    </tr>

</table>
</form>
   
   
   <br/>
   
   
   delete<form name="formjsp" method="post" action="delete.jsp">
<table width="100%" border="0" cellspacing="0" cellpadding="0">

  <tr>
    <td>Emp ID </td>
    <td><input type="text" name="id"></td>
    </tr>
  
  <tr>       <td><input type="submit" name="submit" value="Submit"></td>    </tr>

</table>
</form>
   
   
   
   
   
   
   
   
   
   
   
   
   
      <sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
         url = "jdbc:mysql://ec2-34-211-112-79.us-west-2.compute.amazonaws.com:3306/mysql"
         user = "molotov"  password = "Comrade20"/>
 
      <sql:query dataSource = "${snapshot}" var = "result">
         SELECT * from Employees;
      </sql:query>
 
      <table border = "1" width = "100%">
         <tr>
            <th>Emp ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Age</th>
         </tr>
         
         <c:forEach var = "row" items = "${result.rows}">
            <tr>
               <td><c:out value = "${row.id}"/></td>
               <td><c:out value = "${row.first}"/></td>
               <td><c:out value = "${row.last}"/></td>
               <td><c:out value = "${row.age}"/></td>
            </tr>
         </c:forEach>
      </table>
 
   </body>
</html>