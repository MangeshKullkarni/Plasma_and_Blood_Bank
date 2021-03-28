<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1><a href='<spring:url value="/admin/login"/>'>Admin Login</a></h1>
<h1><a href='<spring:url value="/hospital/login"/>'>Hospital Login</a></h1>
<h1><a href='<spring:url value="/user/donerregistration"/>'>Doner Registration</a></h1>
</body>
</html>