<!DOCTYPE html>
<html lang="en">
<head>
<title>Login</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

<link rel="stylesheet" href="CSS/reg.css" type="text/css">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container">
		<!-- <img src="CSS/10-SEO-books-you-should-read-1.jpg" class="img-circle" alt="Cinque Terre" width="1400" height="700">d -->


		<form action="login" method="post">
			<div class="row">
				<div class="col-md-6">
					<div class="transbox">
						<label for="inputUserName"><b>User Name</b></label> <input
							type="text" class="form-control" placeholder="User Name"
							required="required" name="userName">

					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-6">
					<div class="transbox">
						<label for="inputEmail4"><b>Password</b></label> <input
							type="Password" class="form-control" placeholder="Password"
							required="required" name="Password">
					</div>
				</div>
			</div>
			
			<%-- <%
				String msg = (String)request.getAttribute("m");
								if(msg!=null){
									//<div style="color : red; text-align: center;">Invalid Username/Password</div>--> -->
								//out.print(msg);
							}
								
							%> --%>
			<!-- <div id="message"> -->
			<%
				String msg = (String)request.getAttribute("m");
								if(msg!=null){%>
			<P style="color : red;"><%=msg %></P>
			<%} %>
			<!-- </div> -->
			

			<div class="checkbox">
				<label><input type="checkbox">Remember me</label>
			</div>

			<button type="submit" class="btn btn-primary">Sign in</button>
			<a href="loginPage.jsp" class="btn btn-success">Sign up</a>

		</form>
	</div>
</body>
</html>
