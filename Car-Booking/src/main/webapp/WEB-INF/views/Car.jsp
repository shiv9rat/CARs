<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.app.carbooking.entity.Car"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Car Information</title>
<style>
p.uppercase {
  text-transform: uppercase;
}
</style>
</head>
<body>
<div class="card">
<i>${errorMessage}</i>
  <div class="card-header">
 <b> <p class="uppercase">You Selected  ${Car.brand}</p></b>
  </div>
  <div class="card-body">
  <table class="table table-bordered table-dark">
  <tr>
  <td>MODEL</td>
  <td><p class="uppercase">${Car.model}</p></td>
   </tr>
   <tr>
  <td>YEAR</td>
  <td>${Car.year}</td></tr>
  <tr>
  <td>PRICE</td>
  <td>${Car.price}</td>
  </tr>
  <tr>
  <td>FUEL TYPE</td>
  <td><p class="uppercase">${Car.fuel}</p></td>
  </tr>
   <tr>
   <td></td>
  <td> <a href=" <c:url value="success"/>" class="btn btn-primary">Reserve Your Car</a></td>
  </tr>
 
  </table>

   
  </div>
</div>

<jsp:include page="/WEB-INF/views/footer.jsp"></jsp:include>

</body>
</html>
