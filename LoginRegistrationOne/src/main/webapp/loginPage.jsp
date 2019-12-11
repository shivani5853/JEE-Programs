<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<title>Login Form</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

<link rel="stylesheet" href="CSS/loginPageCSS.css" type="text/css">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<script type="text/javascript">
	function confirmPass() {
		var pass = document.getElementById("Password").value
		var confPass = document.getElementById("ConfirmPassword").value
		if (pass != confPass) {
			alert('Wrong confirm password !');
		}
	}
</script>

</head>
<body>
	<div class="container">
		<form action="loginImpl" method="post">
			<div class="form-row">
				<div class="col-md-4">
					<div class="transbox">
						<label for="inputFirstName"><b>First Name</b></label> <input
							type="text" class="form-control" id="First Name"
							placeholder="First Name" name="firstName" required="required"
							pattern=".{2,}">
					</div>
				</div>

				<div class="col-md-4">
					<div class="transbox">
						<label for="inputLastName"><b>Last Name</b></label> <input
							type="text" class="form-control" id="Last Name"
							placeholder="Last Name" name="lastName" required="required"
							pattern=".{2,}">

					</div>
				</div>
			</div>

			<div class="form-row">
				<div class="col-md-4">
					<div class="transbox">
						<label for="inputUserName"><b>User Name</b></label> <input
							type="text" class="form-control" id="User Name"
							placeholder="User Name" name="userName" required="required"
							pattern=".{2,}">
					</div>
				</div>

				<div class="col-md-4">
					<div class="transbox">
						<label for="inputPassword"><b>Password</b></label> <input
							type="password" class="form-control" id="Password"
							placeholder="password" name="password" onchange='check_pass()'
							required="required" pattern=".{2,}">
					</div>
				</div>
			</div>

			<div class="form-row">
				<div class="col-md-4">
					<div class="transbox">
						<label for="inputPassword"><b>Confirm Password</b></label> <input
							type="password" class="form-control" id="ConfirmPassword"
							placeholder="Confirmpassword" name="ConfirmPassword"
							required="required" pattern=".{2,}" onblur="confirmPass()">
					</div>
				</div>

				<div class="col-md-4">
					<div class="transbox">
						<label for="inputPhoneNumber"><b>Phone Number</b></label> <input
							type="text" class="form-control" id="Phone Number"
							placeholder="Phone Number" name="phoneNumber"
							pattern="[7896][0-9]{9}">
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="transbox">
					<label for="inputEmailId"><b>Email Id</b></label> <input
						type="text" class="form-control" id="Email ID"
						placeholder="Email Id" name="emailId" required="required"
						pattern="[A-Za-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$">
				</div>
			</div>
			<div class="col-md-4">
				<div class="form-group">
					<div class="form-check">
						<input class="form-check-input" type="checkbox" id="gridCheck">
						<label class="form-check-label" for="gridCheck">Check me</label>
					</div>
				</div>
			</div>

			<button type="submit" class="btn btn-primary">Submit</button>
			<button type="reset" class="btn btn-secondary">Reset</button>
			<a href="index.jsp" class="btn btn-secondary">Cancel</a>
		</form>
	</div>
</body>
</html>