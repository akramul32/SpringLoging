<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <title>login</title>
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
        
        <h1>Login</h1>
        
        <form action="login">
            <table>
                <tr><td>User Name</td><td><input type="text" name="name"/></td></tr>
                <tr><td>Password</td><td><input type="text" name="password"/></td></tr>
                <tr><td></td><td><input type="submit" value="Login"/></td></tr>
                <tr><td colspan="2">not a user? register <a href="<%=request.getContextPath()%>/regester">here</a></td><td></tr>
                
            </table>
        </form>
    </body>
</html>
