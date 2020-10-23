<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Plan travel</title>
</head>
<body>
<h1>Plan For a Travel</h1>
<form action="${pageContext.request.contextPath}/plan-travel.htm" method="post">
  BusProviderName:  <select name="providerName">
   <option></option>
  <c:forEach items="${busProviders}" var="busProvider">
  <option value="${busProvider.providerName}">${busProvider.providerName}</option>
  </c:forEach>
  </select>
  Source: <input type="text" name="source"> </br>
  Destination: <input type="text" name="destination"> </br> 
  travel Date: <input type="text" name="travelDate" >
    <%-- <fmt:formatDate value="11/10/2019" pattern="dd/MM/yyyy"/> --%>
    </input>
  </br>
  MinPrice:<input type="text" name="minPrice"> &nbsp; MaxPrice:<input type="text" name="minPrice">
  <input type="submit" value="search">
</form>
</body>
</html>