<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<title>DRCL_Logistics</title>

<style type="text/css">

table, th, td {
border: 2px #2b2b2b solid;
color: #2b2b2b;
}

table { background-color: #bde9ba; }
th { background-color: #ffd78c; }

</style>
</head>
<body>
<table border="1">
<tr>
   <th>ID</th>
   <th>MODE</th>
   <th>ENABLE</th>
   <th>GRADE</th>
   <th>NOTE</th>
 </tr>
 <c:forEach items="${list}"  var="ob">
 <tr>
   <td><c:out value="${ob.shipmentId}"></c:out></td>
   <td><c:out value="${ob.shipmentMode}"></c:out></td>
   <td><c:out value="${ob.shipmentCode}"></c:out></td>
   <td><c:out value="${ob.shipmentGrade}"></c:out></td>
   <td><c:out value="${ob.note}"></c:out></td>
   <td><a href="delete?id=${ob.shipmentId}"><img src="../resources/images/delete.png" height="40" width="40" /></a></td>
 </c:forEach>
 
</table>
<a href="excel"><img src="../resources/images/BulkExcel.png" height="40" width="180" /></a>
<a href="register">Registration</a>
</body>

</html>