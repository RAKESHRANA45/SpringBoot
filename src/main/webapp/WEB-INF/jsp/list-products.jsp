<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>

<head>
<title>Product's for ${name}</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>

<body>
	<div class="container">
		<table class="table table-striped">
			<caption>Your products are</caption>
			<thead>
				<tr>
					<th>User</th>
					<th>ProductName</th>
					<th>BrandName</th>
					<th>Quantity</th>
					<th>Price</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${products}" var="product">
					<tr>
						
						<td>${product.user}</td>
						<td>${product.productName}</td>
						<td>${product.brandName}</td>
						<td>${product.quantity}</td>
						<td>${product.price}</td>
						<td><a type="button" class="btn btn-warning" href="/delete-product?productId=${product.productId}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div> <a class="button" href="/add-product">Add a Product</a></div>

		<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
		<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	</div>
</body>

</html>