<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
.formdiv {
	height: 80vh;
	display: flex;
	justify-content: center;
}

form {
	width: 50%;
	height: 550px;
	display: flex;
	flex-direction: column;
	gap: 30px;
	background-color: white;
	font-family: monospace;
	padding: 50px 30px 20px;
	border: 0px solid transparent;
	border-radius: 3px;
	box-shadow: 0px 0px 5px;
}

input {
	height: 50px;
	padding: 10px 15px 10px;
	font-size: 17px;
	border: 1px solid black;
	border-radius: 3px;
	width: 100%;
	padding: 10px 15px 10px;
}

button[type="submit"], button[type="reset"]{
	padding: 10px 15px;
	font-size: 15px;
	background-color: #0866ff;
	color: white;
	font-weight: bold;
	border: 0px solid black;
	border-radius: 3px;
	width: 150px;
}

.btn {
	padding: 10px 15px;
	font-size: 16px;
	background-color: #0866ff;
	color: white;
	font-weight: bold;
	border: 0px solid black;
	border-radius: 3px;
	width: 150px;
	text-decoration: none;

}

textarea {
	width: 100%;
	font-size: 17px;
	border: 1px solid black;
	border-radius: 3px;
	padding: 10px 15px;
	font-family: sans-serif;
}

main {
	padding-top: 80px;
}
</style>

</head>
<body>
	<%@include file="hotel-navbar.jsp"%>
	<main>


		<div class="formdiv">
			<form action="update-product" method="post">
			
				<input type="hidden" name="productid" value="<%=request.getAttribute("productid") %>">
				<input type="text" name="productname" value="<%=request.getAttribute("productname") %>" placeholder="Product Name"
					required>
				<textarea rows="5" cols="1" name="description"
					placeholder="Description"  required><%=request.getAttribute("description") %></textarea>
				<input type="number" name="price" placeholder="Price"  value="<%=request.getAttribute("price") %>" required>
				<input type="file" name="image" required>

				<div>
					<button type="submit">Update Product</button>
					<button type="reset">Reset</button>
					
					<a href="hotel-home" class="btn">Product</a>
				</div>



				<%	Object msg = "";
					if (request.getAttribute("message") != null) {
						msg = request.getAttribute("message");
					}
				%>
				<%=msg%>

			</form>
		</div>
	</main>

</body>
</html>