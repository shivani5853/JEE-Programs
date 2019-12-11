<%@page import="com.bridgelabz.loginregistrationOne.model.PersonDetails"%>
<%@page import="com.bridgelabz.loginregistrationOne.utility.Utility"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<style>
.row {
	padding: 10px;
}

.transbox {
	margin: 30px;
	background-color: transparent;
	opacity: 0.6;
	filter: alpha(opacity = 60);
}

.container {
	background-repeat: no-repeat;
	background-size: 70% 100%;
	min-height: 1000%;
	margin-top: 5%;
	margin-left: 30%;
}
</style>

<title>Insert title here</title>
</head>
<body>

	<div class="container">
		<form action="update" method="post">
		<%-- <%
				Connection conn = null;
				Statement stmt = null;
				PreparedStatement pstmt=null;
				ResultSet rs = null;
				try {
					Class.forName("com.mysql.jdbc.Driver");
					String username = "root";
					String password = "root";
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", username, password);
					stmt = conn.createStatement();
					String newUserName=request.getParameter("newUserName");
					String query="select * from login.Registation where UserId='"+newUserName+"'";
					rs = stmt.executeQuery(query);
					while (rs.next()) {
			%> --%>
			
			<%
				PersonDetails personDetails = (PersonDetails)request.getAttribute("userdetails");
			%>
		<!-- 	<input type="hidden" name="UserId"> -->
			<div class="form-row">
				<div class="col-md-4">
					<div class="transbox">
						<label for="inputFirstName"><b>First Name</b></label> <input
							type="text" class="form-control" id="First Name"
							placeholder="First Name" name="FirstName" required="required"
							pattern=".{2,}" value="<%=personDetails.getFirstName()%>">
					</div>
				</div>

				<div class="col-md-4">
					<div class="transbox">
						<label for="inputLastName"><b>Last Name</b></label> <input
							type="text" class="form-control" id="Last Name"
							placeholder="Last Name" name="LastName" required="required"
							pattern=".{2,}"value="<%=personDetails.getLastname()%>">

					</div>
				</div>
			</div>

			<div class="form-row">
				<div class="col-md-4">
					<div class="transbox">
						<label for="inputUserName"><b>User Name</b></label> <input
							type="text" class="form-control" id="User Name"
							placeholder="User Name" name="UserId" required="required"
							pattern=".{2,}" value="<%=personDetails.getUserName()%>" readonly="readonly">
					</div>
				</div>

				<div class="col-md-4">
					<div class="transbox">
						<label for="inputPhoneNumber"><b>Phone Number</b></label> <input
							type="text" class="form-control"  id="Phone Number"
							placeholder="Phone Number" name="PhoneNo"
							pattern="[7896][0-9]{9}" value="<%=personDetails.getPhoneNumber()%>">
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="transbox">
					<label for="inputEmailId"><b>Email Id</b></label> <input
						type="text" class="form-control" id="Email ID" 
						placeholder="Email Id" name="Emailid" required="required"
						pattern="[A-Za-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" value="<%=personDetails.getEmailId()%>">
				</div>
			<%-- 	<%
					}
			rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		%> --%>
			</div>
			<button type="submit" class="btn btn-primary">Update</button>
			<a href="Home.jsp" class="btn btn-secondary">Cancel</a>
		</form>
	</div>
</body>
</html>