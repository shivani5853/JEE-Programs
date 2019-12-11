<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Form</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container">
		<form action="Delete" method="post">
			
			<div class="row">
				<div class="col-md-6">
					<label for="inputUserName"><b>User Name</b></label> <input
						type="text" class="form-control" placeholder="User Name" name="userId">
				</div>
			</div>
			<div></div>
			<button type="submit" class="btn btn-danger">Delete</button> 
				<a
				href="Home.jsp" class="btn btn-primary">Back</a>
				<a
				href="index.jsp" class="btn btn-secondary">Cancel</a>
		</form>
	</div>
</body>
</html>