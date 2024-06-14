<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
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
	width: 30%;
	height: 520px;
	display: flex;
	justify-content: flex-start;
	text-align: center;
	flex-direction: column;
	gap: 15px;
	border: 2px solid transparent;
	border-radius: 5px;
	background-color: white;
	font-size: 15px;
	font-family: monospace; input { padding : 5px 15px;
	font-size: 15px;
	border: 2px solid black;
	border-radius: 3px;
	box-shadow: 0px 0px 3px;
	margin: 10px auto 0px;
}

input {
	padding: 10px 15px;
	font-size: 15px;
	border: 1px solid black;
	border-radius: 3px;
	width: 90%
}

input[type="file"] {
	padding: 10px 15px;
	font-size: 15px;
	border: none;
	width: 90%
}

button {
	padding: 10px 15px;
	font-size: 15px;
	background-color: #0866ff;
	color: white;
	font-weight: bold;
	border: 0px solid black;
	border-radius: 3px;
	margin: 0px auto;
	width: 90%
}

.already {
	color: black;
	height: 20px;
	font-size: 13px;
	font-family: cursive;
	text-decoration: none;
	margin: -10px auto 10px;
	font-weight: bold;
}

.already:hover {
	border-bottom: 2px solid blue;
	color: blue;
}
</style>
</head>
<body>
	<div class="formdiv">
		<form action="customer-login" method="post" >
			<input type="text" name="name" placeholder="Name" required>
			<input type="email" name="email" placeholder="Email" required> 
			<input type="tel" name="phone" placeholder="Phone" required>
			<input type="password" name="password" placeholder="Password" required>
			<input type="password" name="repassword" placeholder="Re-Password" required>



			<button type="submit">Create Customer Account</button>
			
			
			<a href="customer-login" class="already">Already Registered</a>
			<a href="hotel-signup" class="already">Hotel Signup</a>
		</form>
	</div>
</body>
</html>