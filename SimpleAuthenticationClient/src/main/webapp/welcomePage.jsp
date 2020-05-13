<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html5>
<html>
<head>
<meta charset="UTF-8">
<title>OAuth App</title>
</head>
<body>

	<h2>This is the Index page of Auth App</h2>
	<div style="align: center">
		<form action="loginAction" method="post">
			<div>
				<label for="userName">Enter User Name</label> <input type="text"
					name="userName" id="userName"> <label for="userPass">Enter
					Password</label> <input type="text" name="userPass" id="userPass">
					<input type="submit">
			</div>
			


		</form>
	</div>

</body>
</html>