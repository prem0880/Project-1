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
  alert("Your Details has been updated");
}
</script>
</head>
<body>

<%
HttpSession session1 = request.getSession(true);
String user = (String) session1.getAttribute("mail");
//out.println(user);
HttpSession session2=request.getSession();
session.setAttribute("mail",user);
%>





<form action="http://localhost:8080/ERSApp/EmployeeUpdateDetails" method="get">

<div class="container">
    <h1>Update Employee Information</h1>
    <hr>

    <label for="employeename"><b>Employee Name</b></label>
    <input type="text" placeholder="Enter Name" pattern="[A-Za-z]{7,20}" name="name" required>


<label for="Department"><b>Department
	<select id="Department" name="department">
  		<option value="Finance">Finance</option>
  		<option value="Operations">Operations</option>
  		<option value="R&D">Research and Development</option>
  		<option value="Production">Production</option>
  		<option value="Human Resources">Human Resources</option>
 	</select>
 	
</b></label>
	<br></br>
  
    <label for="contact"><b>Contact Number</b></label>
    <input type="text" placeholder="Enter Contact number" name="contact"   pattern="[0-9]{10}" maxlength="10" required>     
        
    <div class="clearfix">
    <button type="button" class="cancelbtn">Cancel</button>
   <button type="submit" class="signupbtn" onclick="myFunction()">Update</button>
    
    </div>
    
  </div>
</form>

</body>
</html>