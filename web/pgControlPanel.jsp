<%-- 
    Document   : pgControlPanel
    Created on : 5 Aug, 2019, 3:25:37 PM
    Author     : webwerks
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
        <div><center>
            <h3>
                <span class="title">Control</span><span class="title1">Panel</span>
            </h3>
            </center>
        </div>
        <h4>Hello ${user}, Welcome to Merlin Enterprises.</h4>
        <form action="processLogout" method="post">
            <button class="button1" >Logout</button>
    
        </form><br>
        
        <div align="center">
            
                <button class="button1" >UserDB</button>
                <table border="0" cellpadding="5">
                <caption><h3>User Details</h3></caption>
                <tr>
                    <th>ID</th>
                    <th>Username</th>
                    <th>Date Of Birth</th>
                    <th>Gender</th>
                    <th>Mobile No.</th>
                    <th>Email ID</th>
                    <th>Password</th>
                    <th>Actions</th>
                </tr>
                
                </table>
            
        </div>   
    </body>
</html>
