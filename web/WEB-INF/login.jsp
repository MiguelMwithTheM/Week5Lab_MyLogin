<%-- 
    Document   : login
    Created on : Feb 12, 2023, 3:54:12 PM
    Author     : migue
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    
    <body>
        
        <%--Title--%>
        <h1>Login</h1>
        
        <%--Form--%>
        <form name="logForm" method="post">
            Username: <input type="text" name="uInput" value="${uInput}"> <br>
            Password: <input type="text" name="pInput" value="${pInput}"> <br>
            <input type="submit" name="submit" value="Log in">
        </form>
        
        <%--Message--%>
        <p>${message}</p>
        
    </body>
</html>
