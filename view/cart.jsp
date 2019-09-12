<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:url value="/resources/images/" var="image"/>
  <table>
   
   <c:forEach items="${cartlist}" var="cart">
     <tr>
        <td>
           ${cart.productid}
           <img src="${image}${cart.productid}.jpg" height="50px" width="50px"/>
         </td> 
          <td>
             ${cart.price}
          </td>
          <td>
           <a href='deletecart?id=${cart.id}'>delete</a>
          </td>
      </tr>
   </c:forEach>
   Total amount ${carttotal}
</table>
<c:url value="payment" var="payment"/>
<a href="${payment}">payment</a>
</body>
</html>