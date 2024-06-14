<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

.formdiv {
	height: 100vh;
	display: flex;
	justify-content: center;
	align-items: flex-start;
	border: 2px solid transparent;
	padding-top: 100px;
	background-color: #07C6FB;
	display: flex;
}

form {
	padding: 20px;
	width: 25%;
	height: 300px;
	display: flex;
	justify-content: flex-start;
	text-align: center;
	flex-direction: column;
	gap: 20px;
	border: 2px solid transparent;
	border-radius: 5px;
	background-color: white;
	font-size: 15px;
	font-family: monospace; input { padding : 5px 15px;
	font-size: 15px;
	border: 2px solid black;
	border-radius: 3px;
	box-shadow: 0px 0px 3px;
}

input {
	padding: 10px 15px;
	font-size: 15px;
	border: 1px solid black;
	border-radius: 3px;
}

.forget {
	color: blue;
	height: 20px;
	font-size: 16px;
	font-family: monospace;
	text-decoration: none;
	margin: -10px auto 10px;
	font-weight: bold;
}

.forget:hover {
	border-bottom: 2px solid blue;
}

button {
	padding: 10px 15px;
	font-size: 15px;
	background-color: #0866ff;
	color: white;
	font-weight: bold;
	border: 0px solid black;
	border-radius: 3px;
}

.btn {
	margin: 0px auto;
	padding: 10px 15px;
	font-size: 17px;
	background-color: #0866ff;
	color: white;
	font-weight: bold;
	border: 0px solid black;
	border-radius: 3px;
	text-align: center;
	padding: 10px 15px;
	text-decoration: none;
}
</style>
</head>
<body>

	<div class="formdiv">
		<form action="hotel-home" method="post">
			<input type="email" name="email" placeholder="Email" required>
			<input type="password" name="password" placeholder="Password"
				required>

			<button type="submit">Login As Hotel</button>
			<a href="forget.jsp" class="forget">Forgot Password</a> 
			<a href="customer-login" class="btn">Customer Login</a>
		</form>
	</div>
</body>
</html>