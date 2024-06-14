<%@page import="dao.Dao"%>
<%@page import="dto.Products"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>




<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<style type="text/css">
main {
	padding-top: 80px;
}

.maindiv {
	display: flex;
	align-items: flex-start;
	flex-wrap: wrap;
	gap: 30px;
	width: 100%;
	padding: 10px 90px 10px 110px;
}

.innerdiv {
	padding: 20px;
	background-color: orange;
	width: 250px;
	display: flex;
	justify-content: flex-start;
	flex-direction: column;
	align-items: flex-start;
	flex-wrap: wrap;
	gap: 10px;
	border-radius: 10px;
}

img {
	width: 100%;
}

button {
	border: none;
	padding: 5px 20px;
	border-radius: 5px;
	background-color: green;
	color: white;
}

.d {
	background-color: red;
}
</style>

</head>
<body>

	<%@include file="hotel-navbar.jsp"%>


	<main>

		<div class="maindiv">
			<%
			List<Products> list = Dao.fetchAllProduct();
			for (Products products : list) {
			%>

			<div class="innerdiv">
				<img alt="image"
					src="https://upload.wikimedia.org/wikipedia/commons/thumb/9/9f/Dosa_at_Sri_Ganesha_Restauran%2C_Bangkok_%2844570742744%29.jpg/220px-Dosa_at_Sri_Ganesha_Restauran%2C_Bangkok_%2844570742744%29.jpg">
				<h2><%=products.getProductname()%></h2>
				<p><%=products.getDescription()%></p>
				<p><%=products.getPrice()%></p>

				<div>
					<a href="UpdateProduct?productid=<%=products.getProductid()%>"><button>Edit</button></a>
					
					<a  href="DeleteProduct?productid=<%=products.getProductid()%>"><button class="d">Delete</button></a>
					
				</div>
			</div>


			<%
			}
			%>
		</div>

	</main>


</body>
</html>