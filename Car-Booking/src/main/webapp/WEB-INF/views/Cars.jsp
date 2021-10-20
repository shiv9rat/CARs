<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<head>
<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
<title>Search results</title>
<style>

</style>
</head>
<br><br>
<body bgcolor="white">
	<h2 align="center">YOUR CARS</h2>
	
	<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Brand</th>
      <th scope="col">Model</th>
      <th scope="col">Year</th>
      <th scope="col">KMs</th>
      <th scope="col">Price</th>
      <th scope="col">Fuel Type</th>
      <th scope="col">View</th>
    </tr>
  </thead>
  <tbody>
   <c:forEach items="${cars}" var="car">
    <tr>
   
				<td><c:out value="${car.brand}" /></td>
				<td><c:out value="${car.model}" /></td>
				<td><c:out value="${car.year}" /></td>
				<td><c:out value="${car.kms}" /></td>
				<td><c:out value="${car.price}" /></td>
				<td><c:out value="${car.fuel}" /></td>
				<td><a href=" <c:url value="getCar?id=${car.id}" />" />
					View car</a></td>
			
			</tr>
		</c:forEach>
    </tr>
  </tbody>
</body>
<jsp:include page="/WEB-INF/views/footer.jsp"></jsp:include>
</html>
