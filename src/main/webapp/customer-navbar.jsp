<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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

nav {
	height: 55px;
	width: 100%;
	background-color: #0BF8C8;
	display: flex;
	justify-content: space-between;
	align-items: center;
	padding: 20px;
	position: fixed;
}

.navdiv1 {
	width: 30%;
	height: 55px;
	display: flex;
	align-items: center;
}

.navdiv2 {
	width: 25%;
	height: 55px;
}

.navdiv2 ul {
	width: 100%;
	height: 55px;
	display: flex;
	justify-content: space-evenly;
	align-items: center;
	list-style: none;
}

.navdiv2 ul li a {
	font-size: 19px;
	text-decoration: none;
}

.navdiv2 ul li a button {
	font-size: 14px;
	padding: 4px 10px;
	background-color: blue;
	border: 1px solid transparent;
	border-radius: 4px;
	color: white;
	font-weight: bold;
}

main {
	padding-top: 80px;
}
</style>

</head>
<body>
	<header>
		<nav>
			<div class="navdiv1">
				<h1>FOODAPP</h1>
			</div>

			<div class="navdiv2">
				<ul>
					<li><a href="customer-home"><button>Product</button></a></li>
					<li><a href="customer-cart"><button>Cart</button></a></li>
					<li><a href="customer-order"><button>Order</button></a></li>
					<li><a href="index.jsp"><button>LogOut</button></a></li>
				</ul>
			</div>
		</nav>
	</header>

</body>
</html>