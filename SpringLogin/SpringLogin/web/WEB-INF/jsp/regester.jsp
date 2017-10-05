<%-- 
    Document   : regester
    Created on : Oct 6, 2017, 5:13:29 AM
    Author     : DOLPHIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>register</title>
    </head>
    <body>
         <c:if test="${sm!=null}">
            <font color="green">
                ${sm}
            </font>
        </c:if>
        
        <c:if test="${em!=null}">
            <font color="red">
                ${em}
            </font>
        </c:if>
        
        <h1>Create user</h1>
        
        <form action="createuser" method="post">
            <table>
                <tr><td>User Name</td><td><input type="text" name="name"/></td></tr>
                <tr><td>Password</td><td><input type="text" name="password"/></td></tr>
                <tr><td></td><td><input type="submit" value="Submit"/></td></tr>
                <tr><td><a href="<%=request.getContextPath()%>/">go back</a></td><td></td></tr>
            </table>
        </form>
    </body>
</html>
