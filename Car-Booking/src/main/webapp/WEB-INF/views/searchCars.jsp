<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Car</title>
	<style>

.form {
    position: relative
}

.form .fa-search {
    position: absolute;
    top: 20px;
    left: 20px;
    color: #9ca7af
}

.form span {
    position: absolute;
    right: 17px;
    top: 13px;
    padding: 2px;
    border-left: 1px solid #af9c9f
     color:#af9c9f
}

.left-pan {
    padding-left: 7px
}

.left-pan i {
    padding-left: 10px
}

.form-input {
    height: 55px;
    text-indent: 33px;
    border-radius: 10px
}

.form-input:focus {
    box-shadow: none;
    border: none
}
</style>
</head>
<body>
	
	<br><br><br><br>
	<div class="container">
    <div class="row height d-flex justify-content-center align-items-center">
        <div class="col-md-4">
        <form action="getCars" method="post">
            <div class="form"> <i class="fa fa-search"></i> 
            <input type="text" name="searchcars" class="form-control form-input" placeholder="Search Cars..."> 
            <i>${errorMessage}</i>
           <span class="left-pan"><i class="fa fa-microphone"></i></span>
            </form> </div>
        </div>
    </div>
</div>
	
	
</body>
<jsp:include page="/WEB-INF/views/footer.jsp"></jsp:include>
</html>