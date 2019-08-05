<%-- 
    Document   : pgUserDatabase
    Created on : 5 Aug, 2019, 4:46:07 PM
    Author     : webwerks
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="pgCPStyle.css">
        <title>Control Panel</title>
    </head>
    <body>
        <%
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); //HTTP 1.1
            response.setHeader("Pragma", "no-cache"); //HTTP 1.0
            response.setHeader("Expires", "0"); //Proxies
            
            if(session.getAttribute("user") == null){
                response.sendRedirect("pgLogin.jsp");
            }
        %>
        
    </body>
</html>
