<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
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
	<a href="loginPage.jsp" class="btn btn-primary">Add</a>

	<a href="index.jsp" class="btn btn-primary">Logout</a>

	
		<table class="table table-striped table-dark">
			<thead class="thead-dark">
				<tr>
					<td>FirstName</td>
					<td>LastName</td>
					<td>Emailid</td>
					<td>UserId</td>
					<td>PhoneNo</td>
					<td>Delete</td>
					<td>Edit</td>
				</tr>
			</thead>
			<%
				Connection conn = null;
				Statement stmt = null;
				ResultSet rs = null;
				try {
					Class.forName("com.mysql.jdbc.Driver");
					String username = "root";
					String password = "root";
					String query = "select * from login.Registation";
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", username, password);
					stmt = conn.createStatement();
					rs = stmt.executeQuery(query);
					while (rs.next()) {
			%>
			<tr>
				<td><%=rs.getString("FirstName")%></td>
				<td><%=rs.getString("LastName")%></td>
				<td><%=rs.getString("Emailid")%></td>
				<td><%=rs.getString("UserId")%></td>
				<td><%=rs.getString("PhoneNo")%></td>
				<td>
				<form action="delete" method="post">
					<input type="hidden" name="uid" value="<%=rs.getString("UserId")%>">
					<button type="submit" class="btn btn-primary">Delete</button>
				</form>
				
				</td>
				<td>
					<form action="edit" method="post">
					<input type="hidden" name="uid" value="<%=rs.getString("UserId")%>">
					<button type="submit" class="btn btn-primary">Edit</button>
				</form>
				</td>
			</tr>
			<%
				}
			%>

		</table>
		<%
			rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		%>



</body>
</html>