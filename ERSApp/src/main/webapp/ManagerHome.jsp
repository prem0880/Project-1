<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" session="true"%>
<!DOCTYPE html>
<html>
<head>

<title>Employee Home</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  
</head>
<style>
body {
  background-color: #92a8d1;
}
</style>
<body>
<%
HttpSession session1 = request.getSession(true);
String user = (String) session1.getAttribute("mail");
String pass = (String) session1.getAttribute("pass");
//out.println(user+" "+pass);
HttpSession session2 = request.getSession(true);
session2.setAttribute("mail",user);
%>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand">Manager Home</a>
    </div>
   <ul class="nav navbar-nav">
      <li class="active">
       <li><a href="http://localhost:8080/ERSApp/ManagerReimbursementActions">Approve/Deny Pending Reimbursement Requests</a></li>
      </li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">View Operations <span class="caret"></span></a>
        <ul class="dropdown-menu">
        <li><a href="http://localhost:8080/ERSApp/ManagerPendingRequests">View All Pending Requests</a></li>
       	 <li><a href="http://localhost:8080/ERSApp/ManagerResolvedRequests">View All Resolved Requests</a></li>
        <li><a href="http://localhost:8080/ERSApp/ManagerEmployeeView">View Reimbursement Requests of Specific Employee</a></li>
        <li><a href="http://localhost:8080/ERSApp/ManagerViewDetails">View All Employees</a></li>
        </ul></li>  
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="http://localhost:8080/ERSApp/LogoutSession"><span class="glyphicon glyphicon-user"></span> Log out</a></li>
    </ul>
  </div>
</nav> 
</body>
</html>