<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tables</title>
</head>
<body>
<br>Supplier ID : ${sups.get(0).supId}<br>
Supplier Name:${sups.get(0).supName}
<table border="1" width="70%">
      <tr>    
      <th>Coffee Name</th>
      <th>Sales</th>
      <th>Total</th>
      <th>Price</th>    
      </tr>
        <c:forEach  var="current"  items="${coffees}" >
        <tr>
          <td><c:out value="${current.cofName}" /></td>
          <td><c:out value="${current.sales}" /></td>
          <td><c:out value="${current.total}" /></td>
          <td><c:out value="${current.price}" /></td>          
        </tr>
      </c:forEach>
    </table>

</body>
</html>
