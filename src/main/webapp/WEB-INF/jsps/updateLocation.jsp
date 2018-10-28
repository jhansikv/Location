<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="updateloc" method="post">
       <pre>
         Id: <input type="text" name="id" value="${location.id}" readonly/>
          Code: <input type="text" name="code" value="${location.code}"/>
           Name: <input type="text" name="name" value="${location.name}"/>
            Type:<br>
             URBAN:<input type="radio" name="URBAN" value="${location.type='URBAN'?'URBAN':'checked'}"/>
             RURAL:<input type="radio" name="RURAL" value="${location.type='RURAL'?'RURAL':'checked'}"/>
               <input type="submit" value="UPDATE"/>  
       </pre>
      
   </form>

</body>
</html>