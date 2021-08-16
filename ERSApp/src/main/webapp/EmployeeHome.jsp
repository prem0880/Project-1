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
HttpSession session2=request.getSession();
session.setAttribute("mail",user);
%>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand">Employee Home</a>
    </div>
   <ul class="nav navbar-nav">
      <li class="active">
       <li><a href="http://localhost:8080/ERSApp/EmployeeViewDetails">View Your Information</a></li>
       <li><a href="http://localhost:8080/ERSApp/UpdateDetails.jsp">Update Your Information</a></li>    
      </li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Reimbursement Operations<span class="caret"></span></a>
        <ul class="dropdown-menu">
        <li><a href="http://localhost:8080/ERSApp/ReimbursementRequest.jsp">Submit a Reimbursement Request</a></li>
       	 <li><a href="http://localhost:8080/ERSApp/EmployeePendingRequests">View Pending Reimbursement Requests</a></li>
        <li><a href="http://localhost:8080/ERSApp/EmployeeResolvedRequests">View Resolved Reimbursement Requests</a></li>
        </ul></li>  
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="http://localhost:8080/ERSApp/LogoutSession"><span class="glyphicon glyphicon-user"></span> Log out</a></li>
    </ul>
  </div>
</nav> 

</body>
</html>