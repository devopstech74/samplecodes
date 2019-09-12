<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:if test="${logoutstatus}==true"> 
<jsp:forward page="login"/>
</c:if>
User Home
Hello 
total elements in cart:${cartsize}
 <%String username=(String)session.getAttribute("username") ;
 out.println(username);
 %>
<a href='logout'>logout</a>
<c:url value="/resources/images/" var="image"/>
<c:forEach items="${productlist}" var="product">
<div>

<img src="${image}${product.id}.jpg"/>
</div>

<div>
${product.productName }
${product.price}
</div>
<div>
 <f:form method="post" action="addtocart" modelAttribute="mycart">
 <input type='hidden' name="email" value=<%=username%>/>
 <input type='hidden' name='productid' value='${product.id}'/>
 <input type='hidden' name='price' value='${product.price}'/>
 
<input type='submit' value='add to cart'/>
</f:form>
</div>
</c:forEach>
 <c:url value="cart" var="gotocart"/>
 <a href='${gotocart}'>View Cart</a>
 
</body>
</html>