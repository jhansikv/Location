<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Location</title>
</head>
<body>
   <form action="saveLoc" method="post">
       <pre>
         Id: <input type="text" name="id"/>
          Code: <input type="text" name="code"/>
           Name: <input type="text" name="name"/>
            Type:<br>
             URBAN:<input type="radio" name="type" value="URBAN"/>
             RURAL:<input type="radio" name="type" value="RURAL"/>
             <input type="submit" value="save"/>
                 
       </pre>
      
   </form>
  ${msg} <br>
  <a href="displayLocations">VIEW ALL</a>
</body>
</html>