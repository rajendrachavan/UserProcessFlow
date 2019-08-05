<%-- 
    Document   : Index
    Created on : 1 Aug, 2019, 2:11:25 PM
    Author     : webwerks
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="pgCPStyle.css">
        <title>Login Page</title>
    </head>
    <body>
        <div><center>
            <h3>
                <span class="title">Log</span><span class="title1">in</span>
            </h3>
            </center>
        </div>
        <div>
            <center>
                <div>
                <form action="processLogin" method="post">
                <table border="0" id="table">
                    
                <tr>
                <td><input type="text" name="usrname" placeholder="Enter Registered EmailID." autofocus required/> 
                </tr>
                
                <tr>
                    <td><input type="password" name="chkpasswd" placeholder="Enter Password." pattern=".{8,}" required title="minimum 8 characters."/></td>    
                </tr>
                
               
                <tr>
                    <td>
                    <span><button class="button1" >Login</button></span>
                    <span><button class="button1" type="reset" value="reset">Clear</button></span>
                    </td>
                </tr>
                <tr>
                    <td style="color: red">${message}</td>
                    <td style="color: green">${successMessage}</td>
                </tr>
                </table>
                <div class="txt">
                    New User? Click Here to <button class="button1" onclick="location.href = 'pgRegister.jsp';">Register</button>
                </div>
                </form>
                </div>
            </center>
        </div>
    </body>
</html>
