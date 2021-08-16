<%@page import="com.ers.entity.EmployeeEntity"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>

</head>
<body>
<h2>Employees Information</h2>

<table>
  <tr>
    <th>Mail</th>
    <th>Name</th>
    <th>Department</th>
    <th>Contact</th>
    <th>Type</th>
  </tr>
  <%List<EmployeeEntity> e =(List<EmployeeEntity>)request.getAttribute("viewall");
        for(EmployeeEntity e1:e){%>
        <%-- Arranging data in tabular form
        --%>
            <tr>
                <td><%=e1.getMail()%></td>
                <td><%=e1.getName()%></td>
                <td><%=e1.getDepartment()%></td>
                <td><%=e1.getContact()%></td>
                <td><%=e1.getType()%></td>
                
            </tr>
            <%}%>  
</table>

</body>
</html>