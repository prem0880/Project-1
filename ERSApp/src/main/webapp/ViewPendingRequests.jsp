<%@page import="com.ers.entity.EmployeeReimbursementEntity"%>
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
<%HttpSession session1 = request.getSession(true);%>
<%String mail=(String)session1.getAttribute("mail");%>



<h2>Pending Reimbursement Requests</h2>

<table>
  <tr>
    <th>Employee Mail</th>
    <th>Employee Name</th>
    <th>Reimbursement ID</th>
    <th>Expense Type</th>
    <th>Expense Amount</th>
    <th>Transaction Date</th>
    <th>Date Of Submission</th>
    <th>Status Of Request</th>
  </tr>
  <%List<EmployeeReimbursementEntity> e =(List<EmployeeReimbursementEntity>)request.getAttribute("plist");
        for(EmployeeReimbursementEntity ere:e){%>
        <%-- Arranging data in tabular form
        --%>
            <tr>
                <td><%=ere.getEmployeeEntity().getMail() %></td>
                <td><%=ere.getEmployeeEntity().getName() %></td>
                <td><%=ere.getId()%></td>
                <td><%=ere.getExpenseType()%></td>
                <td><%=ere.getExpenseAmount()%></td>
                <td><%=ere.getTransactionDate()%></td>
                <td><%=ere.getDateOfSubmission()%></td>
                <td><%=ere.getStatusOfApplication()%></td>
             
            </tr>
   		<%}%>
</table>

</body>
</html>