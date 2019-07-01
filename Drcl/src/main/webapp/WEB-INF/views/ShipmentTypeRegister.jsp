<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<style>
div {
	background-color: lightgrey;
	width: 300px;
	border: 25px solid green;
	padding: 70px;
	margin: 80px;
}
</style>
</head>
<body>
	<h1>Welcome to ShipmentType Register</h1>
	<div>
		<form:form action="save" method="POST" modelAttribute="shipmentType">
			<pre>
Shipment Mode:
<form:select path="shipmentMode">
<form:option value=" ">-SELECT-</form:option>
  <form:option value="AIR">Air</form:option>
  <form:option value="SHIP">Ship</form:option>
  <form:option value="TRUCK">Truck</form:option>
  <form:option value="TRAIN">Train</form:option>
  </form:select>
Shipment Code:
<form:input path="shipmentCode" />
Enable Shipment:
<form:select path="enableShipment">
<form:option value=" ">-SELECT-</form:option>
  <form:option value="Yes">Yes</form:option>
  <form:option value="No">No</form:option>
  </form:select>
Shipment Grade:
<form:radiobutton path="shipmentGrade" value="A" />A
<form:radiobutton path="shipmentGrade" value="B" />B
<form:radiobutton path="shipmentGrade" value="C" />C

Note:
 <form:textarea path="note" />
 <input type="submit" value="Register" />
</pre>
		</form:form>
	</div>
	
</body>
<font color='red'>${msg}</font>
</html>