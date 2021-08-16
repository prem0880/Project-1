<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" session="true"%>
<!DOCTYPE html>
<html>
<head>

<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}
label {
    display: block;
    font: 1rem 'Fira Sans', sans-serif;
}

input,
label {
    margin: .4rem 0;
}
input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for all buttons */
button {
  background-color: #04AA6D;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

button:hover {
  opacity:1;
}

/* Extra styles for the cancel button */
.cancelbtn {
  padding: 14px 20px;
  background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
  float: left;
  width: 50%;
}

/* Add padding to container elements */
.container {
  padding: 16px;
}

/* Clear floats */
.clearfix::after {
  content: "";
  clear: both;
  display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
  .cancelbtn, .signupbtn {
     width: 100%;
  }
}
</style>
<script>
function myFunction() {
  alert("Your Request has been Submitted");
}
</script>

</head>
<body>
<%
HttpSession session1 = request.getSession(true);
String user=(String)session1.getAttribute("mail");
HttpSession session2 = request.getSession();
session2.setAttribute("mail", user);
%>
<form action="http://localhost:8080/ERSApp/EmployeeReimbursementRequest" style="border:1px solid #ccc" method="get">
  <div class="container">
    <h1>Reimbursement Form</h1>
    <hr>

   	<label for="Expense Type"><b>Expense Type
	<select id="Expense Type" name="expensetype">
  		<option value="Medical">Medical</option>
  		<option value="Education">Education</option>
  		<option value="Travel">Travel</option>
 	</select>
 	
</b></label>
	<br></br>
    <label for="expense amount"><b>Expense Amount</b></label>
    <input type="text" placeholder="Enter Expense Amount" name="amount" required>
	
	<label for="start"><b>Transaction Date 

	<input type="date" id="start" name="tdate" value="2021-08-01" min="2021-01-01" max="2021-08-31">
	
	</b></label>
	<br></br>
	<label for="start"><b>Date Of Submission 

    <input type="date" id="start" name="ddate" value="2021-08-01" min="2021-01-01" max="2021-08-31">
       
     </b></label>
       <br></br>
    <label for="status"><b>Status of Application : 
    <input type="hidden" placeholder="Enter the status of Application" name="status"  value="pending" required>Pending
    
    </b></label>
    
    <div class="clearfix">
    <button type="button" class="cancelbtn">Cancel</button>
    <button type="submit" class="signupbtn" onclick="myFunction()">Request</button>
     
    </div>
  </div>
</form>



</body>
</html>