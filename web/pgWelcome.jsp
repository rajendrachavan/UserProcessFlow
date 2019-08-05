<%-- 
    Document   : welcome
    Created on : 1 Aug, 2019, 3:08:44 PM
    Author     : webwerks
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="pgStyle.css">
        <title>Welcome Page</title>
    </head>
    <body bgcolor="green">
        <%
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); //HTTP 1.1
            response.setHeader("Pragma", "no-cache"); //HTTP 1.0
            response.setHeader("Expires", "0"); //Proxies
            
            if(session.getAttribute("user") == null){
                response.sendRedirect("pgLogin.jsp");
            }
        %>
        Hello ${user}, Welcome to Merlin Enterprises.
        <form action="processLogout" method="post">
            <button class="button1" >Logout</button>
        </form>
    </body>
</html>
