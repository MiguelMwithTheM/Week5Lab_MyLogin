<%-- 
    Document   : home
    Created on : Feb 12, 2023, 4:02:27 PM
    Author     : migue
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    
    <body>
        
        <%--Title--%>
        <h1>Home Page</h1>
        
        <%--Content--%>
        <p>Hello ${AccountService.username}</p>
        
        <%--Logout--%>
        <a href="login">Log out</a>
        
    </body>
</html>
