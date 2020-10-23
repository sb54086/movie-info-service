<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Journeys</title>
	<style type="text/css">
	 *{
	   font-family: Tahoma;
	   font-size: 20px
	 }
	 table{
	   column-span:colspan;
	    border: 1px solid black;
	 }
	 tr:nth-child(odd) {
	  color: red;
	  background-color: blue;
		}
	tr:nth-child(even) {
	   color: green;
	   background-color: pink;
		}
	th{
	   color: black;
	   font-size: 22px
	}
	</style>
	</head>
<body>
<h1>Journeys</h1>
<table border="1">
  <tr>
      <th>BuisnessName</th>
      <th>ContactNo</th>
      <th>EmailAdress</th>
      <th>Cost</th>
      <th>TravelTimeinHours</th>
  </tr>
  
 <c:forEach items="${journeys}" var="journey">
     <tr> 
       <td>${journey.buisnessName}</td>
       <td>${journey.primaryBuisnessContactNo}</td>
       <td>${journey.primaryBuisnessEmailAdress}</td>
       <td>${journey.cost}</td>
       <td>${journey.timeInHours}</td>
    </tr>
 </c:forEach>
 
</table>
</body>
</html>