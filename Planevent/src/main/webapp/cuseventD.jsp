<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
   
</head>
<body>
 <table>
<c:forEach var="cus" items="${formdetails}">

<c:set var="id"  value="${cus.id}"/>
<c:set var="name"  value="${cus.username}"/>
<c:set var="menu"  value="${cus.foodm}"/>
<c:set var="theme"  value="${cus.decorationt}"/>
<c:set var="entertainment"  value="${cus.entertainment}"/>
<c:set var="transport"  value="${cus.transport}"/>
<c:set var="tmethod"  value="${cus.tmethod}"/>
<c:set var="pcount"  value="${cus.pcount}"/>
<c:set var="concern"  value="${cus.concerns}"/>
  
   <tr>    
  <td>Customer id</td>
  <td>${cus.id}</td>
  </tr>
  
  <tr>
    <td>Customer User Name</td>
    <td>${cus.username}</td>
    </tr>
    
      <tr><td>Food and Beverage Menu </td>
      <td>${cus.foodm}</td></tr>
      
      
       <tr><td>Decoration Theme</td>
       <td>${cus.decorationt}</td></tr>
       
        <tr><td>Entertainment Theme</td>
        <td>${cus.entertainment}</td></tr>
         <tr><td>Transport</td>
         <td>${cus.transport}</td></tr>
         
         <tr><td>Transport Method</td>
         <td>${cus.tmethod}</td></tr>
         
        <tr><td>Passenger Count</td>
        <td>${cus.pcount}</td></tr>
        
         <tr><td>Customer Concerns</td>
         <td>${cus.concerns}</td></tr>
    
</c:forEach>
</table> 

<c:url value="updatecustomer.jsp" var="cusupdate">

<c:param name="id" value="${id}"/>
<c:param name="name" value="${name}"/>
<c:param name="menu" value="${menu}"/>
<c:param name="theme" value="${theme}"/>
<c:param name="entertainment" value="${entertainment}"/>
<c:param name="transport" value="${transport}"/>
<c:param name="tmethod" value="${tmethod}"/>
<c:param name="pcount" value="${pcount}"/>
<c:param name="concern" value="${concern}"/>

</c:url>

<a href="${cusupdate}">

    <input type="button"  name="update" value="Update Data">
</a>

<br>

<c:url value="deletecustomer.jsp"  var="cusdelete">

<c:param name="id" value="${id}"/>
<c:param name="name" value="${name}"/>
<c:param name="menu" value="${menu}"/>
<c:param name="theme" value="${theme}"/>
<c:param name="entertainment" value="${entertainment}"/>
<c:param name="transport" value="${transport}"/>
<c:param name="tmethod" value="${tmethod}"/>
<c:param name="pcount" value="${pcount}"/>
<c:param name="concern" value="${concern}"/>


</c:url>

<a href="${cusdelete}" >

<input type="button"  name="delete" value="Delete Account">


</a>

</body>
</html>
