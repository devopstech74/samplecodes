<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:url value="addproduct" var="add"/>
<form method='post' action="${add}">
Enter Product name
<input type='text' name='prname'/>
Enter Price 
<input type='text' name='price'/>
Enter Quantity
<input type='text' name='quantity'/>
Enter description
<input type='text' name='description'/>
<input type='submit' vale='save'/>
</form>
</body>
</html>